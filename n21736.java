import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n21736 {
    static char[][] arr;
    static boolean[][] visited;
    static int n, m, count, a, b;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String []args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        n = Integer.parseInt(input.split(" ")[0]);
        m = Integer.parseInt(input.split(" ")[1]);
        arr = new char[n][m];
        visited = new boolean[n][m];
        for(int i=0;i<n;i++) {
            String line = br.readLine();
            for(int j=0;j<m;j++) {
                arr[i][j] = line.charAt(j);
                if(arr[i][j] == 'I') {
                    a = i;
                    b = j;
                }
            }
        }
        dfs(a, b);
        if(count==0)
            System.out.println("TT");
        else
            System.out.println(count);
    }
    public static void dfs(int x, int y) {
        visited[x][y] = true;
        for(int i=0;i<4;i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx<0 || ny<0 || nx>=n || ny>=m) continue;
            if(!visited[nx][ny] && arr[nx][ny] == 'O') 
                dfs(nx, ny);
            if(!visited[nx][ny] && arr[nx][ny] == 'P') {
                count++;
                dfs(nx, ny);
            }
        }
    }
}
