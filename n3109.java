import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n3109 {
    static char[][] map;
    static boolean[][] visited;
    static int r, c, count;
    static int[] dx = {-1, 0, 1};
    static int[] dy = {1, 1, 1};
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        r = Integer.parseInt(s.split(" ")[0]);
        c = Integer.parseInt(s.split(" ")[1]);
        map = new char[r][c];
        visited = new boolean[r][c];
        count = 0;
        for(int i=0;i<r;i++) {
            String line = br.readLine();
            for(int j=0;j<c;j++)
                map[i][j] = line.charAt(j);
        }
        for(int i=0;i<r;i++) {
            if(dfs(i, 0))
                count++;
        }
        System.out.println(count);
    }
    public static boolean dfs(int x, int y) {
        for(int i=0;i<3;i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx<0 || ny<0 || nx>=r || ny>=c ) continue;
            if(visited[nx][ny] || map[nx][ny] == 'x') continue;
            visited[nx][ny] = true;
            if(ny==c-1) return true;
            if(dfs(nx, ny)) return true;
        }
        return false;
    }
}
