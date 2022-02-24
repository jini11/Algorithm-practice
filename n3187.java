import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n3187 {
    static char[][] arr;
    static boolean[][] visited;
    static int r, c, v, k, countv, countk; //늑대 v, 양 k
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        arr = new char[r][c];
        visited = new boolean[r][c];
        countv = 0;
        countk = 0;

        for(int i=0;i<r;i++) {
            String line = br.readLine();
            for(int j=0;j<c;j++) {
                arr[i][j] = line.charAt(j);
            }
        }
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                if(!visited[i][j] && arr[i][j] != '#') {
                    v = 0;
                    k = 0;
                    dfs(i, j);
                    if(k<=v)
                        countv += v;
                    else
                        countk += k;
                }
            }
        }
        System.out.println(countk+" "+countv);
    }
    public static void dfs(int x, int y) {
        visited[x][y] = true;
        if(arr[x][y] == 'k') k++;
        if(arr[x][y] == 'v') v++;
        for(int i=0;i<4;i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx<0 || ny<0 || nx>=r || ny>=c) continue;
            if(visited[nx][ny] || arr[nx][ny] == '#') continue;

            visited[nx][ny] = true;
            dfs(nx, ny);
        }
    }
}
