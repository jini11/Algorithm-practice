import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n1388 {
    static String[][] arr;
    static boolean[][] visited;
    static int n, m, count;
    public static void main(String []args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        n = Integer.parseInt(line.split(" ")[0]);
        m = Integer.parseInt(line.split(" ")[1]);
        count = 0;
        arr = new String[n][m];
        visited = new boolean[n][m];

        for(int i=0;i<n;i++) {
            String temp = br.readLine();
            for(int j=0;j<m;j++)
                arr[i][j] = temp.split("")[j];
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(visited[i][j]==false) {
                    count++;
                    dfs(i, j, arr[i][j]);
                }
            }
        }
        System.out.println(count);
    }
    public static void dfs(int x, int y, String shape) {
        visited[x][y] = true;
        if(shape.equals("|")) {
            int nx = x + 1;
            if(nx<n) {
                if(arr[nx][y].equals("|") && visited[nx][y]==false) 
                    dfs(nx, y, "|");
            }
        } else if(shape.equals("-")) {
            int ny = y + 1;
            if(ny<m) {
                if(arr[x][ny].equals("-") && visited[x][ny]==false) 
                    dfs(x, ny, "-");
            }
        }
    }
}
