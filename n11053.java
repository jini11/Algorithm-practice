import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n11053 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] d = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++)
            arr[i] = Integer.parseInt(st.nextToken());
        d[0] = 1;
        for(int i=1;i<n;i++) {
            d[i] = 1;
            for(int j=0;j<i;j++) {
                if(arr[i] > arr[j] && d[i] <= d[j])
                    d[i] = d[j] + 1;
            }
        }
        int result = 0;
        for(int num : d)
            result = Math.max(result, num);
        System.out.println(result);
    }
}
