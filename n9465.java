import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n9465 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++) {
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[2][n];
            int[][] dp = new int[2][n];
            int max = 0;
            for(int i=0;i<2;i++) {
                st = new StringTokenizer(br.readLine());
                for(int j=0;j<n;j++)
                    arr[i][j] = Integer.parseInt(st.nextToken());
            }

            dp[0][0] = arr[0][0];
            dp[1][0] = arr[1][0];
            dp[1][1] = arr[1][1];
            dp[0][1] = arr[0][1];

            for(int i=2;i<n;i++) {
                for(int j=0;j<2;j++) {
                    if(j==0) {
                        dp[i][j] = Math.max(dp[i-1][1], dp[i-2][1]) + arr[i][j];
                    } else {
                        dp[i][j] = Math.max(dp[i-1][0], dp[i-2][0]) + arr[i][j];
                    }
                    max = Math.max(dp[i][j], max);
                }
            }
            System.out.println(max);
        }
    }
}
