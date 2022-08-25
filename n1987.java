import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n1987 {
    static int[][] map;
    static boolean[] visited;
    static int r, c;
    static int answer = 0;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        map = new int[r][c];
        visited = new boolean[26];
        
        for(int i=0;i<r;i++) {
            String s = br.readLine();
            for(int j=0;j<c;j++)
                map[i][j] = s.charAt(j) - 'A';
        }
        dfs(0, 0, 0);
        System.out.println(answer);
    }
    public static void dfs(int x, int y, int cnt) {
        if(visited[map[x][y]]) {
            answer = Math.max(answer, cnt);
            return;
        } else {
            visited[map[x][y]] = true;
            for(int i=0;i<4;i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx<0 || ny<0 || nx>=r || ny>=c) continue;
                dfs(nx, ny, cnt+1);
            }
            visited[map[x][y]] = false;
        }
    }
}
