import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n14889 { // 맞는데 왜 이게 시간초과..?
    static int[][] map;
    static boolean[] visited;
    static int n;
    static int result = Integer.MAX_VALUE;
    public static void main(String []args) throws IOException { // 조합 문제 -> 재귀
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visited = new boolean[n];
        for(int i=0;i<n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0;j<n;j++)
                map[i][j] = Integer.parseInt(st.nextToken());
        }
    
        team(0,0);
        System.out.println(result);
    }
    public static void team(int index, int count) { // 팀 나누기
        if(count == n/2) {
            calc();
            return;
        }
        for(int i=index;i<n;i++) { 
            if(!visited[i]) {
                visited[i] = true;
                team(index + 1, count + 1);
                visited[i] = false;
            }
        }
    }
    public static void calc() { // 팀 능력치 차이 계산
        int start = 0;
        int link = 0;
        for(int i=0;i<n-1;i++) {
            for(int j=i+1;j<n;j++) {
                if(visited[i]==true && visited[j]==true) { // start team
                    start += map[i][j];
                    start += map[j][i];
                } else if(visited[i]==false && visited[j]==false) { // linke team
                    link += map[i][j];
                    link += map[j][i];
                }
            }
        }
        int temp = Math.abs(start-link);
        if(temp == 0) {
            System.out.println(temp);
            System.exit(0);
        }
        result = Math.min(temp, result);
    }
}
