import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class n16236 { // 다시 풀어볼 것, 거리 수 세는 거 주의
    static int[][] arr;
    static boolean[][] visited;
    static int n, count, bx, by;
    static int size = 2;
    static int[] dx = {0, -1, 1, 0};
    static int[] dy = {-1, 0, 0, 1};
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        count = 0;
        for(int i=0;i<n;i++) {
            String line = br.readLine();
            for(int j=0;j<n;j++) {
                arr[i][j] = Integer.parseInt(line.split(" ")[j]);
                if(arr[i][j] == 9) {
                    arr[i][j] = 0;
                    bx = i;
                    by = j;
                }
            }
        }
        
        int eat = 0;
        int[] cnt = null;
        cnt = new int[] {bx, by};
        while(true) {
            PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) ->
            o1[2] != o2[2] ? Integer.compare(o1[2], o2[2]) : (o1[0] != o2[0] ? Integer.compare(o1[0], o2[0]) : Integer.compare(o1[1], o2[1]))
            );
            visited = new boolean[n][n];
            queue.add(new int[] {cnt[0], cnt[1], 0});
            visited[cnt[0]][cnt[1]] = true;

            boolean key = false;

            while(!queue.isEmpty()) {
                cnt = queue.poll();
                if(arr[cnt[0]][cnt[1]] != 0 && arr[cnt[0]][cnt[1]] < size) {
                    eat++;
                    arr[cnt[0]][cnt[1]] = 0;
                    count += cnt[2];
                    key = true;
                    break;
                }
                for(int i=0;i<4;i++) {
                    int nx = cnt[0] + dx[i];
                    int ny = cnt[1] + dy[i];
                    if(nx<0 || ny<0 || nx>=n || ny>=n || visited[nx][ny] || arr[nx][ny] > size) continue;
                    queue.add(new int[] {nx, ny, cnt[2]+1});
                    visited[nx][ny] = true;
                }
            }

            if(!key) break;
            if(size == eat) {
                eat = 0;
                size++;
            }
        }
       
        
        System.out.println(count);
    }
    
}
