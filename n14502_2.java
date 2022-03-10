import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class n14502_2 {
    static int[][] arr;
    static int[][] copy_arr;
    static boolean[][] visited;
    static int n, m, count;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        visited = new boolean[n][m];
        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        copy_arr = arr;
        dfs(0);
        System.out.println(count);
    }
    //벽 세우기
    public static void dfs(int wall) {
        if(wall == 3) {
            bfs();
            return;
        }
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(copy_arr[i][j]==0) {
                    copy_arr[i][j] = 1;
                    dfs(wall+1);
                    copy_arr[i][j] = 0;
                }
            }
        }
    }
    // 바이러스 뿌리기
    public static void bfs() {
        Queue<int[]> queue = new LinkedList<>();
        
        
    }
    // 안전 영역 계산
}
