import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n3184_dfs { //dfs가 더 빠름
    static char[][] arr;
    static boolean[][] visited;
    static int r, c, o, v;
    static int counto, countv;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        r = Integer.parseInt(input.split(" ")[0]);
        c = Integer.parseInt(input.split(" ")[1]);

        arr = new char[r][c];
        visited = new boolean[r][c];
        counto = 0;
        countv = 0;

        for(int i=0;i<r;i++) {
            String line = br.readLine();
            for(int j=0;j<c;j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                if(arr[i][j] != '#' && visited[i][j] == false) {
                    o = 0;
                    v = 0;
                    dfs(i, j);
                    if(o>v) {
                        counto += o;
                    } else if(o<=v) {
                        countv += v;
                    } 
                }
            }
        }
        System.out.println(counto + " " + countv);
    }
    public static void dfs(int x, int y) {
        visited[x][y] = true;
        if(arr[x][y] == 'o') o++;
        else if(arr[x][y] == 'v') v++;

        for(int i=0;i<4;i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>-1 &&ny>-1 && nx<r && ny<c) {
                if(arr[nx][ny] != '#' && visited[nx][ny] == false) {
                    visited[nx][ny] = true;
                    dfs(nx, ny);
                }
            }
        }
        
    }
}
