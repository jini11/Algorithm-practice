import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class n16236_2 {
    static int[][] map;
    static boolean[][] visited;
    static int n, count, eat, sx, sy;
    static int size = 2;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {-1, 0, 1, 0};
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visited = new boolean[n][n];
        count = 0;
        eat = 0;
        for(int i=0;i<n;i++) {
            String s = br.readLine();
            for(int j=0;j<n;j++) {
                map[i][j] = Integer.parseInt(s.split(" ")[j]);
                if(map[i][j] == 9) {
                    map[i][j] = 0;
                    sx = i;
                    sy = j;
                }
            }
        }
        bfs(sx, sy);
        System.out.println(count);
    }
    public static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x, y});
        visited[x][y] = true;

        while(!queue.isEmpty()) {
            int[] point = queue.poll();
            for(int i=0;i<4;i++) {
                int nx = point[0] + dx[i];
                int ny = point[1] + dy[i];
                if(nx<0 || ny<0 || nx>=n || ny>=n || map[nx][ny] > size) continue;
                if(!visited[nx][ny]) {
                    if(map[nx][ny] < size && map[nx][ny] != 0) {
                        map[nx][ny] = 0;
                        queue.add(new int[] {nx, ny});
                        eat++;
                        count++;
                        visited[nx][ny] = true;
                        
                    } else if(map[nx][ny] == size) {
                        queue.add(new int[] {nx, ny});
                        count++;
                        visited[nx][ny] = true;
                    }
                    if(size == eat) {
                        size += 1;
                        eat = 0;
                    }
                }   
            }
        }
    }
}
