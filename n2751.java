import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class n2751 {
    public static void main(String[] args) throws Exception{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
       
       int n=Integer.parseInt(br.readLine());
       ArrayList<Integer> arr=new ArrayList<Integer>();
       for(int i=0;i<n;i++){
           arr.add(Integer.parseInt(br.readLine()));
       }
       Collections.sort(arr);

       for(int i=0;i<n;i++){
           bw.write(arr.get(i)+"\n");
       }
       bw.flush();
       bw.close();
        
    }
}
