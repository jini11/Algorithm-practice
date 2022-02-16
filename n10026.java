import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class n10026 {
    static String[][] arr;
    static boolean[][] visited;
    static int N, count1, count2;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new String[N][N];
        visited = new boolean[N][N];
        count1 = 0;
        count2 = 0;
        for(int i=0;i<N;i++) {
            String line = br.readLine();
            for(int j=0;j<N;j++) {
                arr[i][j] = line.split("")[j];
            }
        }
        //적록색약이 아닌 사람
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                if(visited[i][j]==false) {
                    bfs(i, j, arr[i][j]);
                    count1++;
                }
            }
        }
        visited = new boolean[N][N];
        for(int i=0;i<N;i++) 
            for(int j=0;j<N;j++) 
                if(arr[i][j].equals("G"))
                    arr[i][j] = "R";
                    
        //적록색약
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                if(visited[i][j]==false) {
                    bfs(i, j, arr[i][j]);
                    count2++;
                }
            }
        }
        System.out.println(count1 + " " + count2);
    }
    public static void bfs(int x, int y, String color) {
        Queue<int[]> queue = new LinkedList<>();
        visited[x][y] = true;
        queue.add(new int[] {x, y});

        while(!queue.isEmpty()) {
            int[] point = queue.poll();
            for(int i=0;i<4;i++) {
                int nx = point[0] + dx[i];
                int ny = point[1] + dy[i];
                if(nx>=0 && ny>=0 && nx<N && ny<N) {
                    if(arr[nx][ny].equals(color) && visited[nx][ny]==false) {
                        visited[nx][ny] = true;
                        queue.add(new int[] {nx, ny});
                    }
                }
            }
        }
    }
}
