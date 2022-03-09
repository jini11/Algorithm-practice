import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class n16236 {
    static int[][] arr;
    static boolean[][] visited;
    static int n, count, bx, by;
    static int size = 2;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        visited = new boolean[n][n];
        count = 0;
        for(int i=0;i<n;i++) {
            String line = br.readLine();
            for(int j=0;j<n;j++) {
                arr[i][j] = Integer.parseInt(line.split(" ")[j]);
                if(arr[i][j] == 9) {
                    arr[i][j] = 0;
                    bx = i;
                    by = j;
                }
            }
        }
        bfs(bx, by);
        System.out.println(count);
    }
    public static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        visited[x][y] = true;
        queue.add(new int[] {x, y});
        while(!queue.isEmpty()) {
            int[] point = queue.poll();
            for(int i=0;i<4;i++) {
                int nx = point[0] + dx[i];
                int ny = point[1] + dy[i];
                if(nx<0 || ny<0 || nx>=n || ny>=n || size<arr[nx][ny]) continue;
                if(!visited[nx][ny]) {
                    if(size == arr[nx][ny]) 
                        queue.add(new int[] {nx, ny});
                    else if(size > arr[nx][ny]) {
                        arr[nx][ny] = 0;
                        size += arr[nx][ny];
                        queue.add(new int[] {nx, ny});
                    }
                    visited[nx][ny] = true;
                    count++;
                }
            }
        }
    }
}
