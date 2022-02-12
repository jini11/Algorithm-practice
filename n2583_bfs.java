import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class n2583_bfs {
    static int[][] arr;
    static boolean[][] visited;
    static int m, n;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int count;
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        m = sc.nextInt();
        n = sc.nextInt();
        int k = sc.nextInt();

        arr = new int[n][m];
        visited = new boolean[n][m];
        ArrayList<Integer> list = new ArrayList<>();

        while(k!=0) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            
            for(int i=x1;i<x2;i++) {
                for(int j=y1;j<y2;j++) {
                    arr[i][j] = 1;
                }
            }
            k--;
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(arr[i][j]==0 && visited[i][j]==false) {
                    int result = bfs(i, j);
                    list.add(result);
                }
            }
        }
        Collections.sort(list);        
        System.out.println(list.size());
        for(int i=0;i<list.size();i++)
            System.out.print(list.get(i)+" ");
    }

    public static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x, y});
        visited[x][y] = true;
        int count = 1;

        while(!queue.isEmpty()) {
            int[] point = queue.poll();
            for(int i=0;i<4;i++) {
                int nx = point[0] + dx[i];
                int ny = point[1] + dy[i];
                if(nx>=0 && ny>=0 && nx<n && ny<m) {
                    if(arr[nx][ny]==0 && visited[nx][ny]==false) {
                        visited[nx][ny] = true;
                        queue.add(new int[] {nx, ny});
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
