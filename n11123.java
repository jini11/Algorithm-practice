import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n11123 {
    static char[][] arr;
    static boolean[][] visited;
    static int T, h, w, count;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++) {
            String input = br.readLine();
            h = Integer.parseInt(input.split(" ")[0]);
            w = Integer.parseInt(input.split(" ")[1]);
            arr = new char[h][w];
            visited = new boolean[h][w];
            count = 0;
            for(int i=0;i<h;i++) {
                String line = br.readLine();
                for(int j=0;j<w;j++)
                    arr[i][j] = line.charAt(j);
            }
            for(int i=0;i<h;i++) {
                for(int j=0;j<w;j++){
                    if(!visited[i][j] && arr[i][j] == '#') {
                        dfs(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
    public static void dfs(int x, int y) {
        visited[x][y] = true;
        for(int i=0;i<4;i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx<0 || ny<0 || nx>=h || ny>=w) continue;
            if(!visited[nx][ny] && arr[nx][ny] == '#') {
                dfs(nx, ny);
            }
        }
    }
}
