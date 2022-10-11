import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n15655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) 
            arr[i] = Integer.parseInt(st.nextToken());
        
        Arrays.sort(arr);

        int[] answer = new int[m];

        dfs(0, 0, m, arr, answer);
    }
    public static void dfs(int depth, int start, int m, int[] arr, int[] answer) {
        if(depth == m) {
            for (int i=0; i<answer.length; i++)
                System.out.print(answer[i] + " ");
            System.out.println();
            return;
        }

        for (int i=start; i<arr.length; i++) {
            answer[depth] = arr[i];
            dfs(depth+1, i+1, m, arr, answer);
        }
    }
}
