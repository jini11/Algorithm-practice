import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class n7576 {
    static int[][] arr;
    static boolean[][] visited;
    static int m, n, count, result;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();

        arr = new int[m][n];
        visited = new boolean[m][n];
        count = 0;

        for(int i=0;i<m;i++) 
            for(int j=0;j<n;j++) 
                arr[i][j] = sc.nextInt();
        
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(arr[i][j]==1 && visited[i][j]==false) {
                    bfs(i, j);
                    count++;
                }
            }
        }
        System.out.println("count: "+count);
        System.out.println("result: "+result);
    }
    
    public static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x, y});
        visited[x][y] = true;

        while(!queue.isEmpty()) {
            int[] point = queue.poll();
            for(int i=0;i<4;i++) {
                int nx = point[0] + dx[i];
                int ny = point[1] + dy[i];
                if(nx>-1 && ny>-1 && nx<m && ny<n) {
                    if(arr[nx][ny]==0 && visited[nx][ny]==false) {
                        visited[nx][ny] = true;
                        arr[nx][ny] = 1;
                        queue.add(new int[] {nx, ny});
                    }
                }
            }
        }
    }
}
