import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class n2667 {
    static int[][] arr;
    static boolean[][] visited;
    static int result;
    static int n;
    static int[] xx = {1, -1, 0, 0};
    static int[] yy = {0, 0, 1, -1};
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        arr = new int[n][n];
        visited = new boolean[n][n];
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++) {
            String temp = br.readLine();
            for(int j=0;j<n;j++)
                arr[i][j] = temp.charAt(j) - '0';
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(arr[i][j]==1 && visited[i][j]==false) {
                    result = 1;
                    dfs(i,j);
                    list.add(result);
                }
            }
        }

        Collections.sort(list);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++)
            System.out.println(list.get(i));

    }
    public static void dfs(int x, int y) {
        visited[x][y] = true;

        for(int i=0;i<4;i++) {
            int nx = x + xx[i];
            int ny = y + yy[i];

            if(nx>=0 && ny>=0 && nx<n && ny<n) {
                if(arr[nx][ny]==1 && visited[nx][ny]==false) {
                    dfs(nx, ny);
                    result++;
                }
            }
        }
    }
}
