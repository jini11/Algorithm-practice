import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n2491 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int up = 0;
        int down = 0;
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        int idx = 0;
        int cntUp = 1;
        int cntDown = 1;
        while (idx < N-1) {
            if (arr[idx] <= arr[idx+1]) {
                cntUp++;
            }

            if (arr[idx] > arr[idx+1]) {
                up = Math.max(up, cntUp);
                cntUp = 1;
            }

            if (arr[idx] >= arr[idx+1]) {
                cntDown++;
            }

            if (arr[idx] < arr[idx+1]) {
                down = Math.max(down, cntDown);
                cntDown = 1;
            }
            idx++;
        }
        up = Math.max(up, cntUp);
        down = Math.max(down, cntDown);
        
        System.out.println(Math.max(up, down));
    }
}
