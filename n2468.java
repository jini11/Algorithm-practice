import java.util.Scanner;

public class n2468 {
    static int[][] arr;
    static int[][] map;
    static boolean[][] visited;
    static int N, count, result;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        
        arr = new int[N][N];
        int max = 0;
        result = 1;

        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                arr[i][j] = sc.nextInt();
                if(arr[i][j]>max)
                    max = arr[i][j];
            }
        }
        for(int i=1;i<=max;i++) {
            map = new int[N][N];
            visited = new boolean[N][N];
            count = 0;
            for(int j=0;j<N;j++) {
                for(int k=0;k<N;k++) {
                    if(arr[j][k]<=i)
                        map[j][k] = 0;
                    else map[j][k] = 1;
                }
            }

            for(int j=0;j<N;j++) {
                for(int k=0;k<N;k++) {
                    if(map[j][k]==1 && visited[j][k]==false) {
                        dfs(j, k);
                        count++;
                    }
                }
            }
            result = Math.max(result, count);
        }
        System.out.println(result);        
    }
    public static void dfs(int x, int y) {
        visited[x][y] = true;
        for(int i=0;i<4;i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx>=0 && ny>=0 && nx<N && ny<N) {
                if(map[nx][ny]==1 && visited[nx][ny]==false)
                    dfs(nx, ny);
            }
        }
    }
}
