import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n2981 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=Integer.parseInt(br.readLine());
        }
        
    }
}
