import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class n1966 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++) {
            String input = br.readLine();
            int n = Integer.parseInt(input.split(" ")[0]);
            int m = Integer.parseInt(input.split(" ")[1]);
            Queue<int[]> queue = new LinkedList<>();
            int count = 0;
            String s = br.readLine();
            for(int i=0;i<n;i++) 
                queue.add(new int[] {i, Integer.parseInt(s.split(" ")[i])});
            while(true) {
                int point[] = queue.poll();
                boolean flag = true;
                for(int q[]:queue) {
                    if(q[1] > point[1]) {
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    count++;
                    if(point[0] == m) break;
                } else {
                    queue.add(point);
                }
            }
            System.out.println(count);
            
        }
    }
}
