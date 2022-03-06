import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n1303 {
    static char[][] arr;
    static boolean[][] visited;
    static int n, m, w, b, countw, countb;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        n = Integer.parseInt(input.split(" ")[0]);
        m = Integer.parseInt(input.split(" ")[1]);
        arr = new char[m][n];
        visited = new boolean[m][n];
        countw = 0;
        countb = 0;
        for(int i=0;i<m;i++) {
            String line = br.readLine();
            for(int j=0;j<n;j++) {
                arr[i][j] = line.charAt(j);
            }
        }
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(!visited[i][j]) {
                    w=0;
                    b=0;
                    dfs(i, j, arr[i][j]);
                    countw += Math.pow(w, 2);
                    countb += Math.pow(b, 2);
                }
            }
        }
        System.out.println(countw + " " + countb);
    }
    public static void dfs(int x, int y, char p) {
        visited[x][y] = true;
        if(p=='W') w++;
        if(p=='B') b++;
        for(int i=0;i<4;i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx<0 || ny<0 || nx>=m || ny>=n) continue;
            if(!visited[nx][ny] && arr[nx][ny] == p) 
                dfs(nx, ny, p);
        }
    }
}
