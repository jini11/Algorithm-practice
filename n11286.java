import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
 
public class n11286 {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                if(Math.abs(o1) > Math.abs(o2)) // o1이 더 크면 교환
                    return Math.abs(o1) - Math.abs(o2);
                else if(Math.abs(o1) == Math.abs(o2)) // 같으면 음수를 앞으로
                    return o1 - o2;
                else 
                    return -1;
            } 
        });

        for(int i=0;i<n;i++) {
            int tmp = Integer.parseInt(br.readLine());
            if(tmp == 0) {
                if(pq.isEmpty())
                    System.out.println(0);
                else
                    System.out.println(pq.poll());
            } else
                pq.add(tmp);
        }
    }
}
