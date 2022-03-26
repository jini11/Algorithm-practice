import java.util.Scanner;

public class n14503 {
    static int n, m, r, c, d;
    static int count = 1;
    static int[][] map;
    static int[] dx = {-1, 0, 1, 0}; // 북(0) 동(1) 남(2) 서(3)
    static int[] dy = {0, 1, 0, -1};
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        map = new int[n][m];
        r = sc.nextInt(); // 청소기 x
        c = sc.nextInt(); // 청소기 y
        d = sc.nextInt(); // 방향
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                map[i][j] = sc.nextInt();
            }
        }
        dfs(r, c, d);
        System.out.println(count);
    }
    public static void dfs(int x, int y, int d) {
        map[x][y] = 2; // 청소함

        for(int i=0;i<4;i++) {
            d -= 1;
            if(d==-1) d=3;

            int nx = x + dx[d];
            int ny = y + dy[d];
            if(nx<0 || ny<0 || nx>=n || ny>=m) continue;
            if(map[nx][ny] == 0) {
                count++;
                dfs(nx, ny, d);
                return;
            }
        }
        //주변에 청소할 공간이 없는 경우
        int dd = (d + 2) % 4;
        int mx = x + dx[dd];
        int my = y + dy[dd];
        if(map[mx][my] != 1 && mx>=0 && my>=0 && mx<n && my<m)
            dfs(mx, my, d);
    }
}
