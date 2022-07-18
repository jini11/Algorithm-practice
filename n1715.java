import java.util.PriorityQueue;
import java.util.Scanner;

public class n1715 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Long> queue = new PriorityQueue<>();
        long answer = 0;
        for(int i=0;i<n;i++)
            queue.add(sc.nextLong());
        
        while(queue.size()>1) {
            long a = queue.poll();
            long b = queue.poll();

            answer += a + b;
            queue.add(a + b);
        }
        System.out.println(answer);
    }
}
