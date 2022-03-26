import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n24725 {
    static char[][] arr;
    static int n, m, count;
    static boolean flag;
    static int[] dx = {1, -1, 0, 0, 1, 1, -1, -1};
    static int[] dy = {0, 0, 1, -1, 1, -1, 1, -1};
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        n = Integer.parseInt(input.split(" ")[0]);
        m = Integer.parseInt(input.split(" ")[1]);
        arr = new char[n][m];
        for(int i=0;i<n;i++) {
            String line = br.readLine();
            for(int j=0;j<m;j++)
                arr[i][j] = line.charAt(j);
        }
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(arr[i][j] == 'E' || arr[i][j] == 'I') {
                    flag = true;
                    dfs(i, j);
                }
            }
        }
        System.out.println(count);
    }
    public static void dfs(int x, int y) {
        if(arr[x][y] == 'P' || arr[x][y] == 'J') {
            count++;
            return;
        }
        for(int i=0;i<8;i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx<0 || ny<0 || nx>=n || ny>=m) continue;
            if(flag == true && (arr[nx][ny] == 'N' || arr[nx][ny] == 'S')) {
                flag = false;
                dfs(nx, ny);
            }
            if(flag == false && (arr[nx][ny] == 'F' || arr[nx][ny] == 'T')) {
                dfs(nx, ny);
            }
        }
    }
}
