import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] wine = new int[n];
        int[] dp = new int[n];
        for(int i=0;i<n;i++)
            wine[i] = Integer.parseInt(br.readLine());
        
        dp[0] = wine[0];
        
        if(n>=2)
            dp[1] = wine[0] + wine[1];

        if(n>=3) 
            dp[2] = Math.max(dp[1], Math.max(dp[0]+wine[2], wine[1]+wine[2]));

        for(int i=3;i<n;i++) {
            dp[i] = Math.max(dp[i-1], Math.max(dp[i-3] + wine[i-1] + wine[i], dp[i-2] + wine[i]));
        }
        
        System.out.println(dp[n-1]);
            
    }
}
