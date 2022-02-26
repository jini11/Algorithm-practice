import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n14716 {
    static int[][] arr;
    static boolean[][] visited;
    static int m, n, count;
    static int[] dx = {1, -1, 0, 0, 1, 1, -1, -1};
    static int[] dy = {0, 0, 1, -1, 1, -1, 1, -1};
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        arr = new int[m][n];
        visited = new boolean[m][n];
        count = 0;

        for(int i=0;i<m;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++)
                arr[i][j] = Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(!visited[i][j] && arr[i][j] == 1) {
                    dfs(i, j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void dfs(int x, int y) {
        visited[x][y] = true;
        for(int i=0;i<8;i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx<0 || ny<0 || nx>=m || ny>=n) continue;
            if(visited[nx][ny] || arr[nx][ny] == 0) continue;
            dfs(nx, ny);
        }
    }
}
