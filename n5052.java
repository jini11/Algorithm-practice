import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class n5052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] arr;
        for(int t=0;t<T;t++) {
            int n = Integer.parseInt(br.readLine());
            arr = new String[n];
            String answer = "YES";
            for(int i=0;i<n;i++) {
                arr[i] = br.readLine();
            }
            Arrays.sort(arr);
            for(int i=1;i<n;i++) {
                if(arr[i].startsWith(arr[i-1]))
                    answer = "NO";
            }
            System.out.println(answer);
        }
    }
}
