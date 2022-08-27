import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n1941 {
    static Character[][] map = new Character[5][5];
    static boolean[][] visited = new boolean[5][5];
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int result = 0;
    static int s = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        for(int i=0;i<5;i++) {
            String s = br.readLine();
            for(int j=0;j<5;j++)
                map[i][j] = s.charAt(j);
        }

        for(int i=0;i<5;i++) {
            for(int j=0;j<5;j++) {
                visited = new boolean[5][5];
                if(map[i][j] == 'S') {
                    s = 1;
                    dfs(i, j, 0);
                }
            }
        }
        System.out.println(result);
    }
    public static void dfs(int x, int y, int cnt) {
        visited[x][y] = true;
        if(cnt == 7 && s >= 4) {
            result++;
            return;
        } else if(cnt == 7) {
            return; 
        } else {
            for(int i=0;i<4;i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx<0 || ny<0 || nx>=5 || ny>=5) continue;
                if(!visited[nx][ny]) {
                    if(map[nx][ny] == 'S') s++;
                    dfs(nx, ny, cnt+1);
                }
            }
        }
    }
}

//1. 조합을 이용해 25개 중 7명을 선택
//2. 7명 중 이다솜파가 4명 이상인지 확인
//3. bfs를 통해 7명이 상하좌우 연결되어 있는지 확인