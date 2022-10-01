import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class n2206 {
    static int[][] map;
    static boolean[][] visited;
    static int r, c, result = Integer.MAX_VALUE;
    static int[] dr = {1, 0, 0, -1};
    static int[] dc = {0, -1, 1, 0};

    static class Point {
        int x, y, wall, cnt;
        public Point(int x, int y, int wall, int cnt) {
            this.x = x;
            this.y = y;
            this.wall = wall;
            this.cnt = cnt;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        map = new int[r][c];
        visited = new boolean[r][c];

        for(int i=0;i<r;i++) {
            String s = br.readLine();
            for(int j=0;j<c;j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }

        result = bfs(0, 0);

        if(result == Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(result);
    }
    public static int bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        visited[x][y] = true;
        queue.offer(new Point(x, y, 1, 0));

        while(!queue.isEmpty()) {
            Point p = queue.poll();

            if(p.x == r-1 && p.y == c-1) {
                return p.cnt;
            }

            for(int i=0;i<4;i++) {
                int nx = p.x + dr[i];
                int ny = p.y + dc[i];

                if(nx < 0 || ny < 0 || nx >= r || ny >= c || visited[nx][ny]) continue;
                
                if(map[nx][ny] == 0) {
                    queue.offer(new Point(nx, ny, p.wall, p.cnt+1));
                    visited[nx][ny] = true;
                } else {
                    if(p.wall == 0) {
                        queue.offer(new Point(nx, ny, p.wall+1, p.cnt+1));
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        return -1;
    }
}
