import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class n17086 {
    static int[][] arr;
    static boolean[][] visited;
    static int n, m, count, result;
    static int[] dx = {1, -1, 0, 0, 1, 1, -1, -1};
    static int[] dy = {0, 0, 1, -1, 1, -1, 1, -1};
    static Queue<int[]> queue;
    public static void main(String []args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        n = Integer.parseInt(input.split(" ")[0]);
        m = Integer.parseInt(input.split(" ")[1]);
        arr = new int[n][m];
        visited = new boolean[n][m];
        result = 0;
        queue = new LinkedList<>();
        for(int i=0;i<n;i++) {
            String line = br.readLine();
            for(int j=0;j<m;j++) {
                arr[i][j] = Integer.parseInt(line.split(" ")[j]);
                if(arr[i][j] == 1) queue.add(new int[] {i, j});
            }
        }
        bfs();
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(result < arr[i][j]) result = arr[i][j];
            }
        }
        System.out.println(result-1);
    }
    public static void bfs() {
        while(!queue.isEmpty()) {
            int[] point = queue.poll();
            for(int i=0;i<8;i++) {
                int nx = point[0] + dx[i];
                int ny = point[1] + dy[i];
                if(nx<0 || ny<0 || nx>=n || ny>=m) continue;
                if(arr[nx][ny]==0) {
                    queue.add(new int[] {nx, ny});
                    arr[nx][ny] = arr[point[0]][point[1]] + 1;
                }
            }
        }
    }
}
