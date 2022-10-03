import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n10819 {
    static int N;
    static int[] arr;
    static boolean[] visited;
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        int[] combi = new int[N];
        visited = new boolean[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++)
            arr[i] = Integer.parseInt(st.nextToken());

        dfs(0, combi);

        System.out.println(max);
    }
    public static void dfs(int depth, int[] combi) {
        if(depth == N) {
            max = Math.max(max, sumNum(combi));
            return;
        }

        for(int i=0;i<N;i++) {
            if(!visited[i]) {
                combi[depth] = arr[i];
                visited[i] = true;
                dfs(depth+1, combi);
                visited[i] = false;
            }
        }
    }
    public static int sumNum(int[] combi) {
        int sum = 0;

        for(int i=0;i<N-1;i++) {
            sum += Math.abs(combi[i] - combi[i+1]);
        }

        return sum;
    }
}
