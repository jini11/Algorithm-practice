import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class n15686 {
    static int n, m, result;
    static int[][] map;
    static boolean[] visited;
    static ArrayList<Home> home, chicken;
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n+1][n+1];
        result = Integer.MAX_VALUE;
        home = new ArrayList<>();
        chicken = new ArrayList<>();
        for(int i=1;i<n+1;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<n+1;j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 1) // 집
                    home.add(new Home(i, j));
                if(map[i][j] == 2) // 치킨집
                    chicken.add(new Home(i, j));
            }
        }
        visited = new boolean[chicken.size()];
        dfs(0, 0);
        System.out.println(result);
    }
    public static void dfs(int start, int count) {
        if(count == m) {
            // 도시 최소거리 구하기
            int sum = 0;
            for(int i=0;i<home.size();i++) {
                int temp = Integer.MAX_VALUE;
                for(int j=0;j<chicken.size();j++) {
                    if(visited[j]) {
                        int d = Math.abs(home.get(i).x - chicken.get(j).x) + Math.abs(home.get(i).y - chicken.get(j).y);
                        temp = Math.min(temp, d);
                    }
                }
                sum += temp;
            }
            result = Math.min(result, sum);
            return;
        }
        //백트래킹
        for(int i=start;i<chicken.size();i++) {
            visited[i] = true;
            dfs(i+1, count+1);
            visited[i] = false;
        }
    }
}
class Home {
    int x, y;
    public Home(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

