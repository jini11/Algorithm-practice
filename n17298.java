import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
import java.util.stream.Stream;


public class n17298 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());

        Stack<Integer> answer = new Stack<>();
        Stack<Integer> assistant = new Stack<>();

        String str = br.readLine();
        int[] arr = Stream.of(str.split(" ")).mapToInt(Integer::parseInt).toArray();

        answer.push(-1);
        assistant.push(arr[arr.length-1]);

        
        // int k=arr.length-2;
        // while(true){
        //     if(arr[k]>assistant.peek()){
        //         assistant.pop();
        //     }
        //     if(assistant.empty()){
        //         assistant.push(arr[k]);
        //         answer.push(-1);
        //         k--;
        //     }
        //     if(arr[k]<assistant.peek()){
        //         answer.push(assistant.peek());
        //         assistant.push(arr[k]);
        //         k--;
        //     }
        //     if(k==-1)
        //         break;
        // }

        for(int i=arr.length-2;i>=0;i--){
            while(!assistant.isEmpty() && assistant.peek()<=arr[i]){
                assistant.pop();
            }
            if(assistant.isEmpty()){
                answer.push(-1);
                assistant.push(arr[i]);
            } else {
                answer.push(assistant.peek());
                assistant.push(arr[i]);
            }
            assistant.push(arr[i]);
        }
        for(int i=0;i<num;i++)
            bw.write(answer.pop()+" ");
  
        bw.flush();
        bw.close();
            
    } 
}
