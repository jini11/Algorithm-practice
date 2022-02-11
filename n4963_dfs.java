import java.util.Scanner;

public class n4963_dfs {
    static int[][] arr;
    static boolean[][] visited;
    static int w, h;
    static int result;
    static int[] dx = {0, 0, 1, -1, -1, 1, -1, 1};
    static int[] dy = {1, -1, 0, 0, 1, 1, -1, -1};
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            result = 0;
            w = sc.nextInt();
            h = sc.nextInt();
            if(w==0 && h==0)
                break;
            
            arr = new int[h+1][w+1];
            visited = new boolean[h+1][w+1];

            for(int i=0;i<h;i++) {
                for(int j=0;j<w;j++) {
                    arr[i+1][j+1] = sc.nextInt();
                }
            }

            for(int i=1;i<=h;i++) {
                for(int j=1;j<=w;j++) {
                    if(arr[i][j]==1 && visited[i][j]==false) {
                        result++;
                        dfs(i, j);
                    }
                }
            }
            System.out.println(result);
        }
    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;

        for(int i=0;i<8;i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx>0 && ny>0 && nx<=h && ny<=w) {
                if(arr[nx][ny]==1 && visited[nx][ny]==false) {
                    visited[nx][ny] = true;
                    dfs(nx, ny);
                }
            }
        }
    }
}
