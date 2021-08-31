import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class n18258 {
    static Deque<Integer> queue = new ArrayDeque<>();
    static StringBuilder sb=new StringBuilder();
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
        queue.add(Integer.parseInt(num));
    }

    public static String calc(String co) {
        
        if(co.equals("empty")){
            if(queue.size()==0)
                sb.append("1\n");    
            else
                sb.append("0\n");
        } else if(co.equals("pop")){
            if(queue.size()==0)
                sb.append("-1\n");
            else
                sb.append(Integer.toString(queue.poll())+"\n");
        } else if(co.equals("size")){
                sb.append(Integer.toString(queue.size())+"\n");
        } else if(co.equals("front")){
            if(queue.size()==0)
                sb.append("-1\n");
            else
                sb.append(Integer.toString(queue.peek())+"\n");
        } else if(co.equals("back")){
            if(queue.size()==0)
                sb.append("-1\n");
            else
                sb.append(Integer.toString(queue.getLast())+"\n");
        }

        return sb.toString();
    }
}
