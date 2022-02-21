import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class n2636 {
    static int[][] arr;
    static boolean[][] visited;
    static int n, m, count, cheese, result;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String []args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        n = Integer.parseInt(input.split(" ")[0]);
        m = Integer.parseInt(input.split(" ")[1]);
        
        arr = new int[n][m];
        cheese = 0;

        for(int i=0;i<n;i++) {
            String line = br.readLine();
            for(int j=0;j<m;j++) {
                arr[i][j] = Integer.parseInt(line.split(" ")[j]);
                if(arr[i][j] == 1)
                    cheese++;
            }
        }
        while(cheese!=0) {
            count++;
            result = cheese;
            visited = new boolean[n][m];
            bfs();
        }
        
        System.out.println(count+" "+result);
    }
    public static void bfs() {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {0, 0});
        visited[0][0] = true;
        while(!queue.isEmpty()) {
            int[] point = queue.poll();
            for(int i=0;i<4;i++) {
                int nx = point[0] + dx[i];
                int ny = point[1] + dy[i];
                if(nx>-1&& ny>-1 && nx<n && ny<m && visited[nx][ny] == false) {
                    if(arr[nx][ny] == 1) {
                        cheese--;
                        arr[nx][ny] = 0;
                    } else if(arr[nx][ny] == 0)
                        queue.add(new int[] {nx, ny});
                    visited[nx][ny] = true;
                }
            }
        }
    }
}
