import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class n14502 {
    static int[][] arr;
    static int[][] copy;
    static int n, m, result;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        copy = new int[n][m];
        result = 0;
        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        copy = arr;
        dfs(0);
        System.out.println(result);
    }
    // 벽세우기
    public static void dfs(int num) {
        if(num==3) {
            bfs();
            return;
        }
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(copy[i][j] == 0) {
                    copy[i][j] = 1;
                    dfs(num+1);
                    copy[i][j] = 0;
                }
            }
        }
    }
    // 바이러스 방출
    public static void bfs() {
        int[][] copy_arr = new int[n][m];
        Queue<int[]> queue = new LinkedList<>();

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                copy_arr[i][j] = copy[i][j];
                if(copy_arr[i][j] == 2) {
                    copy_arr[i][j] = 2;
                    queue.add(new int[] {i, j});
                }
            }
        }
        while(!queue.isEmpty()) {
            int[] point = queue.poll();
            for(int i=0;i<4;i++) {
                int nx = point[0] + dx[i];
                int ny = point[1] + dy[i];
                if(nx<0 || ny<0 || nx>=n || ny>=m) continue;
                if(copy_arr[nx][ny] == 0) {
                    copy_arr[nx][ny] = 2;
                    queue.add(new int[] {nx, ny});
                }
            }
        }
        area(copy_arr);
    }
    public static void area(int[][] map) {
        int count = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(map[i][j] == 0)
                    count++;
            }
        }
        result = Math.max(count, result);
    }
}
