import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class n16173 {
    static int[][] arr;
    static boolean[][] visited;
    static int n, count;
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        arr = new int[n][n];
        visited = new boolean[n][n];
        count = 0;
        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++)
                arr[i][j] = Integer.parseInt(st.nextToken());
        }
        bfs(0, 0);
        if(count == 1)
            System.out.println("HaruHaru");
        else
            System.out.println("Hing");
    }
    public static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        visited[x][y] = true;
        queue.add(new int[] {x, y});
        while(!queue.isEmpty()) {
            int[] point = queue.poll();
            int r = point[0], c = point[1];
            if(arr[r][c] == -1) {
                count = 1;
                break;
            }
            int nx = r + arr[r][c];
            int ny = c + arr[r][c];
            if(!visited[nx][c] && nx<n) { 
                queue.add(new int[] {r+arr[r][c], c});
                visited[nx][c] = true;
            }
            if(!visited[r][ny] && ny<n) { 
                queue.add(new int[] {r, c + arr[r][c]});
                visited[r][ny] = true;
            }
        }
    }
}
