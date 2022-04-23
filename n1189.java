import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n1189 {
    static char[][] map;
    static boolean[][] visited;
    static int r, c, k, result;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        map = new char[r][c];
        visited = new boolean[r][c];
        for(int i=0;i<r;i++) {
            String s = br.readLine();
            for(int j=0;j<c;j++)
                map[i][j] = s.charAt(j);
        }
        result = 0;
        visited[r-1][0] = true;
        dfs(r-1, 0, 1);
        System.out.println(result);
    }
    public static void dfs(int x, int y, int count) {
        if(x==0 && y==c-1) {
            if(count == k) result++;
            return;
        }
        for(int i=0;i<4;i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx<0 || ny<0 || nx>=r || ny>=c) continue;
            if(visited[nx][ny] || map[nx][ny] == 'T') continue;
            visited[nx][ny] = true;
            dfs(nx, ny, count+1);
            visited[nx][ny] = false;
        }
    }
}
