import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n18429 {
    static int n, k, count;
    static int[] arr;
    static boolean[] visited;
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        n = Integer.parseInt(s.split(" ")[0]);
        k = Integer.parseInt(s.split(" ")[1]);
        arr = new int[n];
        visited = new boolean[n];
        String input = br.readLine();
        for(int i=0;i<n;i++)
            arr[i] = Integer.parseInt(input.split(" ")[i]);
        dfs(500, 0);        
        System.out.println(count);
    }
    public static void dfs(int power, int day) {
        if(day == n) {
            count++;
            return;
        }
        for(int i=0;i<n;i++) {
            if(visited[i]) continue;
            visited[i] = true;
            if(power - k + arr[i] >= 500)
                dfs(power-k+arr[i], day+1);
            visited[i] = false;
        }
    }
}
