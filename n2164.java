import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class n2164 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int result = 0;
        boolean key = true;
        for(int i=1;i<=n;i++)
            queue.add(i);
        
        while(!queue.isEmpty()) {
            if(!key) {
                int top = queue.poll();
                queue.add(top);
                key = true;
            } 
            if(key) {
                result = queue.poll();
                key = false;
            }
        }
        System.out.println(result);
    }
}
