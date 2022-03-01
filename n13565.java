import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n13565 {
    static char[][] arr;
    static boolean[][] visited;
    static int m, n, result;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        m = Integer.parseInt(input.split(" ")[0]);
        n = Integer.parseInt(input.split(" ")[1]);
        arr = new char[m][n];
        visited = new boolean[m][n];
        result = 0;
        for(int i=0;i<m;i++) {
            String temp = br.readLine();
            for(int j=0;j<n;j++)
                arr[i][j] = temp.charAt(j);
        }

        for(int i=0;i<n;i++) {
            if(arr[0][i] == '0' && !visited[0][i]) {
                dfs(0, i);         
            }
        }
        if(result == 1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    public static void dfs(int x, int y) {
        if(x == m-1) 
            result = 1;
        visited[x][y] = true;
        for(int i=0;i<4;i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx<0 || ny<0 || nx>=m || ny>=n) continue;
            if(arr[nx][ny] == '0' && !visited[nx][ny]) {
                dfs(nx, ny);
            }
        }
    }
}
