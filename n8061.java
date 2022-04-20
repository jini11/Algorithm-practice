import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class n8061 {
    static int[][] map;
    static boolean[][] visited;
    static int n, m;
    static Queue<Point> queue;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        n = Integer.parseInt(s.split(" ")[0]);
        m = Integer.parseInt(s.split(" ")[1]);
        map = new int[n][m];
        visited = new boolean[n][m];
        queue = new LinkedList<>();
        for(int i=0;i<n;i++) {
            String line = br.readLine();
            for(int j=0;j<m;j++) {
                map[i][j] = line.charAt(j)-'0';
                if(map[i][j] == 1) {
                    map[i][j] = 0;
                    queue.add(new Point (i, j, 1));
                    visited[i][j] = true;
                }
            }
        }
        bfs();
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void bfs() {
        while(!queue.isEmpty()) {
            Point p = queue.poll();
            for(int i=0;i<4;i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if(nx<0 || ny<0 || nx>=n || ny>=m) continue;
                if(map[nx][ny] != 0 || visited[nx][ny]) continue;
                
                queue.add(new Point(nx, ny, p.count+1));
                visited[nx][ny] = true;
                map[nx][ny] = p.count;
            }
        }
    }
    static class Point {
        int x;
        int y;
        int count;
        public Point(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }
}
