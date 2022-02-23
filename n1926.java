import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class n1926 {
    static int[][] arr;
    static boolean[][] visited;
    static int n, m, count;
    static ArrayList<Integer> list;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        n = Integer.parseInt(input.split(" ")[0]);
        m = Integer.parseInt(input.split(" ")[1]);
        arr = new int[n][m];
        visited = new boolean[n][m];
        list = new ArrayList<>();
        list.add(0);

        for(int i=0;i<n;i++) {
            String temp = br.readLine();
            for(int j=0;j<m;j++) {
                arr[i][j] = Integer.parseInt(temp.split(" ")[j]);
            }
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(arr[i][j] == 1 && !visited[i][j]) {
                    count = 1;
                    dfs(i, j);
                    list.add(count);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list.size()-1);
        System.out.println(list.get(list.size()-1));
    }
    public static void dfs(int x, int y) {
        visited[x][y] = true;
        for(int i=0;i<4;i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx<0 || ny<0 || nx>=n || ny>=m) continue;
            if(!visited[nx][ny] && arr[nx][ny] == 1) {
                count++;
                dfs(nx, ny);
            }
        }
    }
}
