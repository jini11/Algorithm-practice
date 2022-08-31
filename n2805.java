import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n2805 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] tree = new int[n];
        int max = 0;
        int answer = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
            tree[i] = Integer.parseInt(st.nextToken());
            max = Math.max(tree[i], max);
        }

        int left = 0;
        int right = max;
        while(left <= right) {
            long sum = 0;
            int mid = (left + right) / 2;
            for(int i=0;i<n;i++) {
                if(mid < tree[i]) sum += (tree[i] - mid);
            }
            if(sum < m) {
                right = mid -1;
            } else {
                answer = mid;
                left = mid + 1;
            }
        }
        System.out.println(answer);
    }
}
