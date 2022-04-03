import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class n10845 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int b = -1;
        for(int t=0;t<n;t++) {
            String input = br.readLine();
            if(input.contains("push")) {
                b = Integer.parseInt(input.split(" ")[1]);
                queue.add(b);
            }
            if(input.contains("front")) {
                if(queue.isEmpty()) System.out.println(-1);
                else System.out.println(queue.peek());
            }
            if(input.contains("back")) { 
                if(queue.isEmpty()) System.out.println(-1);
                else System.out.println(b);
            }
            if(input.contains("size")) {
                System.out.println(queue.size());
            }
            if(input.contains("empty")) {
                if(queue.isEmpty()) System.out.println(1);
                else System.out.println(0);
            }
            if(input.contains("pop")) {
                if(queue.isEmpty()) System.out.println(-1); 
                else {
                    System.out.println(queue.poll());
                }
            }
        }
    }
}
