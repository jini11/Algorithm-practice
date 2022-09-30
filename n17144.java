import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class n17144 {
    static int R, C, T;
    static int[][] map;
    static boolean[][] visited;
    static int[] air = new int[2]; // 공기청정기 x값들
    static int[] dx = {0, -1, 1, 0};
    static int[] dy = {1, 0, 0, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());

        map = new int[R][C];
        visited = new boolean[R][C];
        int idx = 0;
        for(int i=0;i<R;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<C;j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == -1) {
                    air[idx++] = i;
                }
            }
        }

        for(int t=0;t<T;t++) {
            spreadDust(); // 먼지 확산
            runAir(); // 공기청정기 작동
        }

        System.out.println(clacDust()); // 먼지 양 계산
    }
    public static void spreadDust() {
        Queue<int[]> queue = new LinkedList<>();

        for(int i=0;i<R;i++) {
            for(int j=0;j<C;j++) {
                if(map[i][j] > 0) queue.add(new int[] {i, j, map[i][j]});
            }
        }

        while(!queue.isEmpty()) {
            int[] p = queue.poll();
            int cnt = 0;
            for(int i=0;i<4;i++) {
                int nx = p[0] + dx[i];
                int ny = p[1] + dy[i];

                if(nx < 0 || ny < 0 || nx >= R || ny >= C || map[nx][ny] == -1) continue;
                cnt++;
                map[nx][ny] += p[2] / 5;
            }
            map[p[0]][p[1]] -= p[2] / 5 * cnt;
        }
    }
    public static void runAir() {
        //위
        int x = air[0]-1;
        int y = 0;
        int dx = 0;
        int dy = 0;
        int tmp = map[x][y];
        while(true) {
            
            if(x == air[0] && y == 1) break;
            if(y == 0 && x > 0) {
                dx = -1;
                dy = 0;
            } else if(x == 0 && y < C-1) {
                dx = 0;
                dy = 1;
            } else if(y == C-1 && x < air[0]) {
                dx = 1;
                dy = 0;
            } else if(x == air[0]) {
                dx = 0;
                dy = -1;
            }
            tmp = map[x][y];
            map[x][y] = map[x+dx][y+dy];
            x += dx;
            y += dy;
        }
        map[air[0]][1] = 0;

        //아래
        x = air[1] + 1;
        y = 0;
        dx = 0;
        dy = 0;
        tmp = map[x][y];
        while(true) { 
            if(x == air[1] && y == 1) break;
            if(y == 0 && x < R-1) {
                dx = 1;
                dy = 0;
            } else if(x == R-1 && y < C-1) {
                dx = 0;
                dy = 1;
            } else if(y == C-1 && x == R-1) {
                dx = -1;
                dy = 0;
            } else if(x == air[1]) {
                dx = 0;
                dy = -1;
            }
            tmp = map[x][y];
            map[x][y] = map[x+dx][y+dy];
            x += dx;
            y += dy;
        }
        map[air[1]][1] = 0;
    }
    public static int clacDust() { // 미세먼지 계산
        int sum = 0;
        for(int i=0;i<R;i++) {
            for(int j=0;j<C;j++) {
                if(map[i][j] == -1) continue;
                sum += map[i][j];
            }
        }
        return sum;
    }
}
