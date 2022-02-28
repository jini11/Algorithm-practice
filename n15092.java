import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class n15092 {
    static char[][] arr;
    static boolean[][] visited;
    static int m, n, count;
    static int[] dx = {1, -1, 0, 0, 1, 1, -1, -1};
    static int[] dy = {0, 0, 1, -1, 1, -1, 1, -1};
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        m = Integer.parseInt(input.split(" ")[0]);
        n = Integer.parseInt(input.split(" ")[1]);

        arr = new char[m][n];
        visited = new boolean[m][n];
        count = 0;
        for(int i=0;i<m;i++) {
            String line = br.readLine();
            for(int j=0;j<n;j++)
                arr[i][j] = line.charAt(j);
        }

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(arr[i][j] == '#' && !visited[i][j]) {
                    bfs(i, j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        visited[x][y] = true;
        queue.add(new int[] {x, y});
        while(!queue.isEmpty()) {
            int[] point = queue.poll();
            for(int i=0;i<8;i++) {
                int nx = point[0] + dx[i];
                int ny = point[1] + dy[i];
                if(nx<0 || ny<0 || nx>=m || ny>=n) continue;
                if(!visited[nx][ny] && arr[nx][ny] == '#') {
                    visited[nx][ny] = true;
                    queue.add(new int[] {nx, ny});
                }
            }
        }
    }
}
