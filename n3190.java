import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class n3190 {
    static int sec = 0;
    static int n, k, l;
    static List<int[]> snake;
    static int[][] map;
    static int[][] dir;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine()); //보드 크기
        k = Integer.parseInt(br.readLine()); //사과 개수
        map = new int[n][n];
        snake = new LinkedList<>();
        snake.add(new int[] {0, 0});
        for(int i=0;i<k;i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a-1][b-1] = 1; // 사과 넣기
        }
        l = Integer.parseInt(br.readLine()); // 변환 횟수
        dir = new int[l][2];
        for(int i=0;i<l;i++) {
            st = new StringTokenizer(br.readLine());
            dir[i][0] = Integer.parseInt(st.nextToken());
            if(st.nextToken().charAt(0) == 'L') 
                dir[i][1] = 1;
            else dir[i][1] = 2; // 오른쪽
        }
        start(0, 0, 0);
        System.out.println(sec);
    }
    public static void start(int x, int y, int d) {
        int cx = x;
        int cy = y;
        int count = 0;
        while(true) {
            sec++;
            int nx = cx + dx[d];
            int ny = cy + dy[d];

            //종료 조건 확인
            if(stop(nx, ny)) break;
            
            if(map[nx][ny] == 1) { //사과 있으면 몸통 늘리기
                map[nx][ny] = 0;
                snake.add(new int[] {nx, ny});
            } else { //사과 없으면 전진
                snake.add(new int[] {nx, ny});
                snake.remove(0);
            }
            
            cx = nx;
            cy = ny;

            // 방향 설정
            if(count<l && sec == dir[count][0]) { // 순서 바꾸면 결과 달라짐 주의
                if(dir[count][1] == 1) { // 왼쪽
                    d -= 1;
                    if(d == -1) d=3;
                } else { // 오른쪽
                    d += 1;
                    if(d == 4) d=0;
                }
                count++;
            }

        }
    }
    public static boolean stop(int nx, int ny) {
        if(nx<0 || ny<0 || nx>=n || ny>=n) return true; // 벽에 닿으면 종료
        for(int i=0;i<snake.size();i++) {
            if(nx == snake.get(i)[0] && ny == snake.get(i)[1])
                return true;
        }
        return false;
    }
}
