import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int max = sum;
        int front = 0;
        int back = k;
        while(back <= n-1) {
            sum -= arr[front++];
            sum += arr[back++];
            max = Math.max(max, sum);
        }
        
        System.out.println(max);
    }
}
