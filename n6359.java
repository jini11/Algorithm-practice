import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n6359 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n+1];
            for(int i=1;i<=n;i++) {
                for(int j=1;j*i<=n;j++) {
                    if(arr[i*j] !=0) arr[i*j] = 0;
                    else arr[i*j] = 1;
                }
            }
            int result = 0;
            for(int i=1;i<=n;i++)
                result += arr[i];
            System.out.println(result);
        }
    }
}
// 소수 찾기