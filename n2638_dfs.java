import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2638_dfs {
    static int n, m, cheese, result;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String []args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        n = Integer.parseInt(input.split(" ")[0]);
        m = Integer.parseInt(input.split(" ")[1]);
        cheese = 0;
        result = 0;
        arr = new int[n][m];
        visited = new boolean[n][m];

        for(int i=0;i<n;i++) {
            String line = br.readLine();
            for(int j=0;j<m;j++) {
                arr[i][j] = Integer.parseInt(line.split(" ")[j]);
                if(arr[i][j] == 1) cheese++;
            }
        }

        change_out_air(0,0);

        while(cheese!=0) {
            visited = new boolean[n][m];
            for(int i=0;i<n;i++) {
                for(int j=0;j<m;j++) {
                    if(arr[i][j] == 1 && !visited[i][j])
                        dfs(i, j);
                }
            }
            visited = new boolean[n][m];
            change_out_air(0, 0);
            for(int i=0;i<n;i++) {
                for(int j=0;j<m;j++) {
                    if(arr[i][j] == 3) arr[i][j] = 2;
                }
            }
            result++;
        }
        System.out.println(result);
    }
    public static void change_out_air(int x, int y) {
        visited[x][y] = true;
        arr[x][y] = 2;

        for(int i=0;i<4;i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx<0 || ny<0 || nx>=n || ny>=m) continue;
            if(visited[nx][ny] || arr[nx][ny] == 1) continue;
            arr[nx][ny] = 2;
            change_out_air(nx, ny);
        }
    }
    public static void dfs(int x, int y) {
        visited[x][y] = true;
        if(arr[x][y] == 1 && check_cheese(x, y)>=2) {
            cheese--;
            arr[x][y] = 3;
        }

        for(int i=0;i<4;i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx<0 || ny<0 || nx>=n || ny>=m) continue;
            if(arr[nx][ny] == 1 && !visited[nx][ny]) dfs(nx, ny);
        }

    }
    public static int check_cheese(int x, int y){
        int air = 0;
        for(int i=0;i<4;i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx<0 || ny<0 || nx>=n || ny>=m) continue;
            if(arr[nx][ny] == 2) air++;
        }
        return air;
    }
}

