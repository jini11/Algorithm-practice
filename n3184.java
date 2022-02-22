import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class n3184 {
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
                    bfs(i, j);
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
    public static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        visited[x][y] = true;
        queue.add(new int[] {x, y});

        if(arr[x][y] == 'o') o++;
        else if(arr[x][y] == 'v') v++;

        while(!queue.isEmpty()) {
            int[] point = queue.poll();
            for(int i=0;i<4;i++) {
                int nx = point[0] + dx[i];
                int ny = point[1] + dy[i];
                if(nx>-1 &&ny>-1 && nx<r && ny<c) {
                    if(arr[nx][ny] != '#' && visited[nx][ny] == false) {
                        visited[nx][ny] = true;
                        queue.add(new int[] {nx, ny});
                        if(arr[nx][ny] == 'o') o++;
                        else if(arr[nx][ny] == 'v') v++;
                    }
                }
            }
        }
    }
}
