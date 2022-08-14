import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n3412 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++) {
            int n = Integer.parseInt(br.readLine());
            int answer = 0;
            for(int i=0;i<n;i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                double r = Math.sqrt(x*x + y*y);
                for(int j=1;j<11;j++) {
                    if(r<=20*j) {
                        answer += 11-j;
                        break;
                    }   
                }
            }
            System.out.println(answer);
        }
    }
}
