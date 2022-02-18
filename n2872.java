import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2872 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int count = 0;
        for(int i=0;i<N;i++)
            arr[i] = Integer.parseInt(br.readLine());
        
        int max = N;
        for(int i=N-1;i>=0;i--) {
            if(max == arr[i])
                max--;
            else
                count++;
        }
        System.out.println(count);
    }
}
