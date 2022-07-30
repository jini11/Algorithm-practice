import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class n1927 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pqueue = new PriorityQueue<>();

        for(int t=0;t<n;t++) {
            int tmp = Integer.parseInt(br.readLine());
            if(tmp == 0) {
                if(pqueue.isEmpty())
                    System.out.println(0);
                else 
                    System.out.println(pqueue.poll());
            } else {
                pqueue.add(tmp);
            }
        }
    }
}
