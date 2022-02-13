import java.util.Scanner;

public class n1012_dfs {
    static int[][] arr;
    static boolean[][] visited;
    static int T, m, n, k;
    static int count;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();

        for(int t=0;t<T;t++) {
            m = sc.nextInt();
            n = sc.nextInt();
            k = sc.nextInt();

            arr = new int[m][n];
            visited = new boolean[m][n];
            count = 0;
            for(int i=0;i<k;i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                arr[a][b] = 1;
            }

            for(int i=0;i<m;i++) {
                for(int j=0;j<n;j++) {
                    if(arr[i][j]==1 && visited[i][j]==false) {
                        count++;
                        dfs(i, j);
                    }
                }
            }
            System.out.println(count);
        }
    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;

        for(int i=0;i<4;i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>-1 && ny>-1 && nx<m && ny<n) {
                if(arr[nx][ny]==1 && visited[nx][ny]==false) {
                    visited[nx][ny] = true;
                    dfs(nx, ny);
                }
            }
        }
    }
}
