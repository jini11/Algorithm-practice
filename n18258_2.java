import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class n18258_2 {
    
    static int[] arr=new int[20000];
    static StringBuilder sb=new StringBuilder();

    static int front=0;
    static int back=0;
    static int size=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String r = br.readLine();
        int n = Integer.parseInt(r);
        String result="";

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String[] sarr = new String[2];
            

            if (s.split(" ")[0].equals("push")) {
                sarr[0] = s.split(" ")[0];
                sarr[1] = s.split(" ")[1];
                push(sarr[0],sarr[1]);
            } else {
                result=calc(s);
                
            }
        }
        System.out.println(result);
    }

    public static void push(String co, String num) {
        arr[front++]=Integer.parseInt(num);
        size++;
        
    }

    public static String calc(String co) {
        
        if(co.equals("empty")){
            if(size==0)
                sb.append("1\n");    
            else
                sb.append("0\n");
        } else if(co.equals("pop")){
            if(size==0)
                sb.append("-1\n");
            else{
                sb.append(arr[back]+"\n");
                back++;
                size--;
            }
        } else if(co.equals("size")){
                sb.append(size+"\n");
        } else if(co.equals("front")){
            if(size==0)
                sb.append("-1\n");
            else{
                sb.append(arr[back]+"\n");
            }
        } else if(co.equals("back")){
            if(size==0)
                sb.append("-1\n");
            else{
                sb.append(arr[front-1]+"\n");
            }
        }

        return sb.toString();
    }
}
