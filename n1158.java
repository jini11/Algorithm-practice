import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class n1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("<");
        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for(int i=1;i<=n;i++)
            queue.offer(i);
        
        while(queue.size() != 1) {
            for(int i=0;i<k-1;i++) {
                queue.offer(queue.poll());
            }
            sb.append(queue.poll()+", ");
        }
        sb.append(queue.poll()+">");
        System.out.println(sb.toString());
    }
}
