import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class n7569 {
    static int[][][] arr;
    static Queue<int[]> queue;
    static int h, m, n, result;
    static int[] dx = {1, -1, 0, 0, 0, 0};
    static int[] dy = {0, 0, 1, -1, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        h = sc.nextInt();
        arr = new int[h][n][m];
        queue = new LinkedList<>();
        result = 0;

        for(int i=0;i<h;i++) {
            for(int j=0;j<n;j++) {
                for(int k=0;k<m;k++) {
                    arr[i][j][k] = sc.nextInt();
                    if(arr[i][j][k] == 1) {
                        queue.add(new int[] {i, j, k});
                    }
                }
            }
        }

        bfs();
        for(int i=0;i<h;i++) {
            for(int j=0;j<n;j++) {
                for(int k=0;k<m;k++) {
                    if(arr[i][j][k] == 0) {
                        System.out.println(-1);
                        return;
                    }
                    result = Math.max(result, arr[i][j][k]);
                }
            }
        }
        System.out.println(result-1);
    }
    public static void bfs() {
        while(!queue.isEmpty()) {
            int[] point = queue.poll();
            for(int i=0;i<6;i++) {
                int nz = point[0] + dz[i];
                int nx = point[1] + dx[i];
                int ny = point[2] + dy[i];
                
                if(nx<0 || ny<0 || nz<0 || nx>=n || ny>=m || nz>=h) continue;
                if(arr[nz][nx][ny] == 0) {
                    queue.add(new int[] {nz, nx, ny});
                    arr[nz][nx][ny] += arr[point[0]][point[1]][point[2]] + 1;
                }
            }
        }
    }
}
