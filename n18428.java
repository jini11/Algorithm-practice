import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class n18428 {
    static char[][] map;
    static int n;
    static boolean key = true;
    static ArrayList<int[]> list;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String []args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        map = new char[n][n];
        list = new ArrayList<>();

        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++) {
                map[i][j] = st.nextToken().charAt(0);
                if(map[i][j] == 'T') {
                    list.add(new int[] {i, j});
                }
            }
        }
        make_wall(0, 0, 0);
        
        System.out.println("NO");
    }
    public static void make_wall(int x, int y, int wall) {
        if(wall == 3) {
            if(check()) {
                System.out.println("YES");
                System.exit(0);
            }
            return;
        }
        for(int i=x;i<n;i++) {
            for(int j=y;j<n;j++) {
                if(map[i][j] == 'X') {
                    map[i][j] = 'O';
                    make_wall(i, j+1, wall+1);
                    map[i][j] = 'X';
                }
            }
            y=0;
        }
    }
    public static boolean check() {
        for(int i=0;i<list.size();i++) {
            int[] point = list.get(i);
            for(int j=0;j<4;j++) {
                int nx = point[0];
                int ny = point[1];
                while(true) {
                    nx += dx[j];
                    ny += dy[j];
                    if(nx<0 || ny<0 || nx>=n || ny>=n) break;
                    if(map[nx][ny] == 'O') break;
                    if(map[nx][ny] == 'S') 
                        return false;
                }
            }
        }
        return true;
    }
}