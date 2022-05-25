import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n1551 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = Integer.parseInt(input.split(" ")[0]);
        int k = Integer.parseInt(input.split(" ")[1]);
        int[] arr = new int[n];
        String s = br.readLine();
        for(int i=0;i<n;i++)
            arr[i] = Integer.parseInt(s.split(",")[i]);
        int cnt = 0;
        while(cnt != k) {
            for(int i=1;i<n;i++) {
                arr[i-1] = arr[i] - arr[i-1];
            }
            cnt++;
        }
        for(int i=0;i<n-k-1;i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println(arr[n-k-1]);
    }
}
