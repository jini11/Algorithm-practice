import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n4677 {
    static char[][] arr;
    static int m, n, count;
    static int[] dx = {1, -1, 0, 0, 1, 1, -1, -1};
    static int[] dy = {0, 0, 1, -1, 1, -1, 1, -1};
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String input = br.readLine();
            m = Integer.parseInt(input.split(" ")[0]);
            n = Integer.parseInt(input.split(" ")[1]);
            if(m==0 && n==0) break;
            arr = new char[m][n];
            count = 0;
            for(int i=0;i<m;i++) {
                String line = br.readLine();
                for(int j=0;j<n;j++)
                    arr[i][j] = line.charAt(j);
            }
            for(int i=0;i<m;i++) {
                for(int j=0;j<n;j++) {
                    if(arr[i][j]=='@') {
                        dfs(i, j);
                        count += 1;
                    }
                }
            }
            System.out.println(count);
        }
    }
    public static void dfs(int x, int y) {
        arr[x][y] = '*';
        for(int i=0;i<8;i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx<0 || ny<0 || nx>=m || ny>=n) continue;
            if(arr[nx][ny] == '@')
                dfs(nx ,ny);
        }
    }
}
