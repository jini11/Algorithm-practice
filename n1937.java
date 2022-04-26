import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n1937 {
    static int[][] map;
    static int[][] dp;
    static int n, count, result;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        dp = new int[n][n];
        count = 0;
        result = 0;
        for(int i=0;i<n;i++) {
            String s = br.readLine();
            for(int j=0;j<n;j++) {
                map[i][j] = Integer.parseInt(s.split(" ")[j]);
            }
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                result = Math.max(dfs(i, j), result);
            }
        }
        System.out.println(result);
    }
    public static int dfs(int x, int y) {
        if(dp[x][y] != 0) return dp[x][y];
        dp[x][y] = 1;

        for(int i=0;i<4;i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx<0 || ny<0 || nx>=n || ny>=n) continue;
            if(map[x][y] >= map[nx][ny]) continue;
            dp[x][y] = Math.max(dp[x][y], dfs(nx, ny) + 1);
        }

        return dp[x][y];
    }
}
