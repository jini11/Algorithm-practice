import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class n3190_2 {
    static int n, k, l;
    static int sec = 0;
    static int[][] map;
    static int[][] dir; // 방향 
    static List<int[]> snake; //뱀 위치
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());
        map = new int[n][n];
        snake = new LinkedList<>();
        snake.add(new int[] {0, 0});
        for(int i=0;i<k;i++) {
            String s = br.readLine();
            int a = Integer.parseInt(s.split(" ")[0]);
            int b = Integer.parseInt(s.split(" ")[1]);
            map[a-1][b-1] = 1; // 사과
        }
        l = Integer.parseInt(br.readLine());
        dir = new int[l][2];
        for(int i=0;i<l;i++) {
            String line = br.readLine();
            dir[i][0] = Integer.parseInt(line.split(" ")[0]);
            if(line.split(" ")[1].equals("D"))
                dir[i][1] = 1; // 오른쪽
            else
                dir[i][1] = 2; // 왼쪽
        }
        move(0,0,0);
        System.out.println(sec);
    }
    public static void move(int x, int y, int d) {
        int sx = x;
        int sy = y;
        int count = 0;
        while(true) {
            sec++; 
            int nx = sx + dx[d];
            int ny = sy + dy[d];
            if(stop(nx, ny)) break; // 종료 조건
            if(map[nx][ny] == 1) { // 사과 먹으면 
                map[nx][ny] = 0;
                snake.add(new int[] {nx, ny});
            } else {
                snake.add(new int[] {nx, ny});
                snake.remove(0);
            }

            sx = nx;
            sy = ny;
            if(count<l && sec == dir[count][0]) {
                if(dir[count][1] == 1) { //오른쪽
                    d += 1;
                    if(d == 4) d=0;
                } else { // 왼쪽
                    d -= 1;
                    if(d == -1) d=3;
                }
                count++;
            }
            
        }
    }
    public static boolean stop(int nx, int ny) {
        if(nx<0 || ny<0 || nx>=n || ny>=n) return true; // 벽에 닿으면 종료
        for(int i=0;i<snake.size();i++) { // 자기 몸에 닿아도 종료
            if(nx == snake.get(i)[0] && ny == snake.get(i)[1])
                return true;
        }
        return false;
    }
}
