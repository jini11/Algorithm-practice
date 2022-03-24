import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class n9372 {
    static int n, m, count;
    static boolean visited[];
    static int[][] arr;
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++) {
            String line = br.readLine();
            n = Integer.parseInt(line.split(" ")[0]);
            m = Integer.parseInt(line.split(" ")[1]);
            count = 0;
            arr = new int[n+1][n+1];
            visited = new boolean[n+1];
            for(int i=0;i<m;i++) {
                String input = br.readLine();
                int a = Integer.parseInt(input.split(" ")[0]);
                int b = Integer.parseInt(input.split(" ")[1]);
                arr[a][b] = 1;
                arr[b][a] = 1;
            }
            bfs();
            System.out.println(count);
        }
    }
    public static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visited[1] = true;
        while(!queue.isEmpty()) {
            int p = queue.poll();
            for(int i=1;i<=n;i++){
                if(arr[p][i] != 0 && !visited[i]){
                    visited[i] = true;
                    queue.add(i);
                    count++;
                }
            }
        }
    }
}
