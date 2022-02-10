import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class n2178 {
    static int[][] arr;
    static boolean[][] visited;
    static int n, m;
    static int[] xx = {1, -1, 0, 0};
    static int[] yy = {0, 0, 1, -1};
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        n = Integer.parseInt(line.split(" ")[0]);
        m = Integer.parseInt(line.split(" ")[1]);

        arr = new int[n+1][m+1];
        visited = new boolean[n+1][m+1];

        for(int i=1;i<=n;i++) {
            String temp = br.readLine();
            for(int j=1;j<=m;j++) 
                arr[i][j] = temp.charAt(j-1) - '0';
        }

        visited[1][1] = true;
        bfs(1,1);
        System.out.println(arr[n][m]);
    }
    public static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[] {x,y});

        while(!queue.isEmpty()) {
            int[] xy = queue.poll();
            for(int i=0;i<4;i++) {
                int nx = xy[0] + xx[i];
                int ny = xy[1] + yy[i];
                if(nx>0 && ny>0 && nx<=n && ny<=m) {
                    if(arr[nx][ny]==1 && visited[nx][ny]==false) {
                        queue.add(new int[] {nx, ny});
                        visited[nx][ny] = true;
                        arr[nx][ny] = arr[xy[0]][xy[1]] + 1;
                    }
                }
            }
        }
    }
}
