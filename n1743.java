import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class n1743 {
    static int[][] arr;
    static boolean[][] visited;
    static int n, m, k, count;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();

        arr = new int[n+1][m+1];
        visited = new boolean[n+1][m+1];
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<k;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = 1;
        }

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=m;j++) {
                if(arr[i][j] == 1 && !visited[i][j]) {
                    count = 1;
                    bfs(i, j);
                    list.add(count);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list.get(list.size()-1));
    }
    public static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        visited[x][y] = true;
        queue.add(new int[] {x, y});
        while(!queue.isEmpty()) {
            int[] point = queue.poll();
            for(int i=0;i<4;i++) {
                int nx = point[0] + dx[i];
                int ny = point[1] + dy[i];
                if(nx<1 || ny<1 || nx>n || ny>m) continue;
                if(arr[nx][ny] == 0 || visited[nx][ny]) continue;

                queue.add(new int[] {nx, ny});
                visited[nx][ny] = true;
                count++;
            }
        }
    }
}
