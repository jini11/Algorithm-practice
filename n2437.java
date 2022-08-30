import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n2437 { 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] weight = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++)
            weight[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(weight);
        int sum = 0;
        for(int i=0;i<n;i++) {
            if(sum + 1 < weight[i])
                break;
            sum += weight[i];
        }
        System.out.println(sum+1);
    }
}
// 누적합
// ex) 1 1 2 의 누적합 4 => 1,2,3,4 까지 만들 수 있음.
// 다음 원소값이 누적합+1 보다 크다면 만들지 못하는 무게이다.
