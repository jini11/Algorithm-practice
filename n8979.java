import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n8979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][4];
        int idx = 0;
        int answer = 1;
        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
            arr[i][3] = Integer.parseInt(st.nextToken());
            if(arr[i][0] == k) idx = i;
        }
        
        for(int i=0;i<n;i++) {
            if(i == idx ) continue;
            if(arr[i][1] > arr[idx][1])
                answer++;
            else if(arr[i][1] == arr[idx][1]) {
                if(arr[i][2] > arr[idx][2]) answer++;
            } else if(arr[i][1] == arr[idx][1] && arr[i][2] == arr[idx][2]) {
                if(arr[i][3] > arr[idx][3]) answer++;
            }
        }
        System.out.println(answer);
    }
}
