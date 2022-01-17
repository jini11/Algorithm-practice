import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n16953 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int a = Integer.parseInt(str.split(" ")[0]);
        int b = Integer.parseInt(str.split(" ")[1]);
        int result = 0;

        while(a!=b) {
            if(b<a) {
                System.out.println(-1);
                System.exit(0);
            }
            if(b%2==0) {
                b /= 2;
                result++;
            }
            else if(b%10==1) {
                b /= 10;
                result++;
            }
            else {
                System.out.println(-1);
                System.exit(0);
            }
        }
       
        System.out.println(result+1);
    }
}
