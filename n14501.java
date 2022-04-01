import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n14501 { // DP
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] t = new int[n];
        int[] p = new int[n];
        int[] arr = new int[n+1];
        for(int i=0;i<n;i++) {
            String input = br.readLine();
            t[i] = Integer.parseInt(input.split(" ")[0]);
            p[i] = Integer.parseInt(input.split(" ")[1]);
        }
        for(int i=0;i<n;i++) {
            if(i + t[i] <= n) {
                arr[i+t[i]] = Math.max(arr[i+t[i]], arr[i] + p[i]);
            }
            arr[i+1] = Math.max(arr[i+1], arr[i]);
        }
        System.out.println(arr[n]);
    }
    
}
