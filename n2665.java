import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class n2665 {
    static int[][] arr;
    static int[][] dist;
    static int n;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        dist = new int[n][n];
        for(int i=0;i<n;i++) {
            String input = br.readLine();
            for(int j=0;j<n;j++) {
                arr[i][j] = Integer.parseInt(input.split("")[j]);
                dist[i][j] = Integer.MAX_VALUE;
            }
        }
        bfs();
        System.out.println(dist[n-1][n-1]);
    }
    public static void bfs() {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {0, 0});
        dist[0][0] = 0;
        while(!queue.isEmpty()) {
            int[] point = queue.poll();
            for(int i=0;i<4;i++) {
                int nx = point[0] + dx[i];
                int ny = point[1] + dy[i];
                if(nx<0 || ny<0 || nx>=n || ny>=n || dist[nx][ny] <= dist[point[0]][point[1]]) continue;
                if(arr[nx][ny] == 1)
                    dist[nx][ny] = dist[point[0]][point[1]];
                else
                    dist[nx][ny] = dist[point[0]][point[1]] + 1;
                queue.add(new int[] {nx, ny});
            }
        }
    }
}
