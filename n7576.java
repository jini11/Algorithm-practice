import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class n7576 {
    static int[][] arr;
    static int m, n, count, result;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static Queue<int[]> queue;
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        arr = new int[n][m];
        count = 0;
        result = 0;
        queue = new LinkedList<>();

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                arr[i][j] = sc.nextInt();
                if(arr[i][j] == 1) {
                    queue.add(new int[] {i, j});
                }
            }
        }
        bfs();
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(arr[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                result = Math.max(result, arr[i][j]);
            }
        }
        System.out.println(result-1);
    }
    public static void bfs() {
        while(!queue.isEmpty()) {
            int[] point = queue.poll();
            for(int i=0;i<4;i++) {
                int nx = point[0] + dx[i];
                int ny = point[1] + dy[i];
                if(nx<0 || ny<0 || nx>=n || ny>=m) continue;
                if(arr[nx][ny] == 0) {
                    queue.add(new int[] {nx, ny});
                    arr[nx][ny] = arr[point[0]][point[1]] + 1;
                }
            }
        }
    }
}
