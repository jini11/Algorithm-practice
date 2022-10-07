import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n2003 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++)
            arr[i] = Integer.parseInt(st.nextToken());

        int left = 0;
        int right = 0;
        int cnt = 0;
        long sum = 0L;
        
        while(true) {
            if (sum >=  M) {
                sum -= arr[left++];
            } 
            else if (right >= N) {
                break;
            }
            else if (sum < M) {
                sum += arr[right++];
            }
            if(sum == M) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}