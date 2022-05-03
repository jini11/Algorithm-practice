import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n14470 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());
        int sec = 0;
        if(a<0) {
            sec = Math.abs(a) * c + d + (b * e);
        } else if(a==0) {
            sec = d + (b * e);
        } else {
            sec = (b - a) * e;
        }
        System.out.println(sec);
    }
}
