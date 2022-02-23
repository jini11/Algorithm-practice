import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class n2638 {
    static int[][] arr;
    static boolean[][] visited;
    static int n, m, count, cheese;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        n = Integer.parseInt(input.split(" ")[0]);
        m = Integer.parseInt(input.split(" ")[1]);

        arr = new int[n][m];
        visited = new boolean[n][m];
        count = 0;
        cheese = 0;

        for(int i=0;i<n;i++) {
            String line = br.readLine();
            for(int j=0;j<m;j++) {
                arr[i][j] = Integer.parseInt(line.split(" ")[j]);
                if(arr[i][j]==1) cheese++;
            }
        }
        checkair(0, 0);
        while(cheese!=0) {
            visited = new boolean[n][m];
            for(int i=0;i<n;i++) {
                for(int j=0;j<m;j++) {
                    if(arr[i][j] == 1 && visited[i][j] == false) {
                        bfs(i, j);
                    }
                }
            }
            visited = new boolean[n][m];
            checkair(0, 0);
            for(int i=0;i<n;i++) {
                for(int j=0;j<m;j++) {
                    if(arr[i][j]==3)
                        arr[i][j]=2;
                }
            }
            System.out.println();
            for(int i=0;i<n;i++) {
                for(int j=0;j<m;j++)
                    System.out.print(arr[i][j]+" ");
                System.out.println();
            }
            System.out.println();
            count++;
        }
        System.out.println(count);
    }   
    public static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x, y});
        visited[x][y] = true;
        while(!queue.isEmpty()) {
            int[] point = queue.poll();
            int empty = 0;
            for(int i=0;i<4;i++) {
                int nx = point[0] + dx[i];
                int ny = point[1] + dy[i];
                if(nx>-1&& ny>-1 && nx<n && ny<m) {
                    if(arr[nx][ny] == 2)
                        empty++;
                    else if(arr[nx][ny] == 1 && visited[nx][ny] == false) {
                        queue.add(new int[] {nx, ny});
                    }
                    visited[nx][ny] = true;
                }
            }
            if(empty>=2) {
                arr[point[0]][point[1]] = 3;
                visited[point[0]][point[1]] = false;
                cheese--;
            }
        }
    }
    public static void checkair(int x, int y) {
        visited[x][y] = true;
        arr[x][y] = 2;

        for(int i=0;i<4;i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>-1&& ny>-1 && nx<n && ny<m) {
                if(!visited[nx][ny] && arr[nx][ny] == 0) {
                    arr[nx][ny] = 2;
                    checkair(nx, ny);
                }
            }
        }
    }
}
