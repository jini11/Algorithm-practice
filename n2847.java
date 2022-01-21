import java.io.*;

public class n2847 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] score = new int[n];
        int result = 0;

        for(int i=0;i<n;i++) {
            score[i] = Integer.parseInt(br.readLine());
        }

        for(int i=n-1;i>0;i--) {
            if(score[i] <= score[i-1]) {
                result++;
                score[i-1]--;
                i++;
            }
        }

        System.out.println(result);
        
    }
}
