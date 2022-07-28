import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class n2161 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp = 0;
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1;i<=n;i++)
            queue.add(i);
        
        for(int i=0;i<n;i++) {
            System.out.print(queue.poll()+" ");
            if(!queue.isEmpty())
                tmp = queue.poll();
            queue.add(tmp);
        }
    }
}
