import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n1463 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        while(true){
            if(n==1) break;
            if(n%3==0) {
                count++;
                n /= 3;
            } else {
                count++;
                n -= 1;
            }
        }
        System.out.println(count);
    }
}
