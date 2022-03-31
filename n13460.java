import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class n13460 { // 다시 풀어볼 것
    static char[][] map;
    static int[][][][] visited;
    static int n, m;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        n = Integer.parseInt(line.split(" ")[0]);
        m = Integer.parseInt(line.split(" ")[1]);
        map = new char[n][m];
        visited = new int[n][m][n][m];
        int frx = 0;
        int fry = 0;
        int fbx = 0;
        int fby = 0;
        for(int i=0;i<n;i++) {
            String input = br.readLine();
            for(int j=0;j<m;j++) {
                map[i][j] = input.charAt(j);
                if(map[i][j] == 'R') {
                    frx = i;
                    fry = j;
                }
                if(map[i][j] == 'B') {
                    fbx = i;
                    fby = j;
                }
            }
        }
        bfs(frx, fry, fbx, fby, 0);
    }
    public static void bfs(int frx, int fry, int fbx, int fby, int cnt) {
        Queue<Ball> queue = new LinkedList<>();
        visited[frx][fry][fbx][fby] = 1;
        queue.add(new Ball(frx, fry, fbx, fby, 0));

        while(!queue.isEmpty()) {
            Ball ball = queue.poll();

            if(ball.cnt > 10) { // 10번 초과이면 실패, 종료
                System.out.println(-1);
                return;
            }
            if(map[ball.bx][ball.by] == 'O') continue; //파란 공이 빠지면 실패(다른 경우의 수가 있을 수 있으므로 일단 진행)
            if(map[ball.rx][ball.ry] == 'O' && map[ball.bx][ball.by] != 'O') { //빨간 공이 빠지면 성공, 종료
                System.out.println(ball.cnt);
                return;
            }
            
            for(int i=0;i<4;i++) {
                //빨간 공 이동
                int nrx = ball.rx;
                int nry = ball.ry;

                while(true) {
                    nrx += dx[i];
                    nry += dy[i];
                    if(map[nrx][nry] == '#' || map[nrx][nry] == 'O') break;
                }
                if(map[nrx][nry] == '#') {
                    nrx -= dx[i];
                    nry -= dy[i];
                }

                //파란 공 이동
                int nbx = ball.bx;
                int nby = ball.by;

                while(true) {
                    nbx += dx[i];
                    nby += dy[i];
                    if(map[nbx][nby] == '#' || map[nbx][nby] == 'O') break;
                }
                if(map[nbx][nby] == '#') {
                    nbx -= dx[i];
                    nby -= dy[i];
                }

                // 빨간 공, 파란 공 위치 같을 경우
                if(nrx == nbx && nry == nby && map[nrx][nry] != 'O') {
                    int rd = Math.abs(nrx - ball.rx) + Math.abs(nry - ball.ry);
                    int bd = Math.abs(nbx - ball.bx) + Math.abs(nby - ball.by);
                    if(rd > bd) { // 파란 공이 더 가깝
                        nrx -= dx[i];
                        nry -= dy[i];
                    } else {
                        nbx -= dx[i];
                        nby -= dy[i];
                    }
                }

                // 다음 진행
                visited[nrx][nry][nbx][nby] = 1;
                queue.add(new Ball(nrx, nry, nbx, nby, ball.cnt+1));
            }


        }
    }
}
class Ball {
    int rx;
    int ry;
    int bx;
    int by;
    int cnt;
    Ball(int rx, int ry, int bx, int by, int cnt) {
        this.rx = rx;
        this.ry = ry;
        this.bx = bx;
        this.by = by;
        this.cnt = cnt;
    }
}
