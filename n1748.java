import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n1748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int plus = 1;
        int num = 10;
        for(int i=1;i<=n;i++) {
            if(i%num == 0) {
                plus++;
                num *= 10;
            }
            cnt += plus;
        }
        System.out.println(cnt);
    }
}

