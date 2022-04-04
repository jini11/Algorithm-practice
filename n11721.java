import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n11721 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int start = 0;
        for(int i=0;i<s.length();i++) {
            if(i%10==0 && i/10>0) {
                String temp = s.substring(start, i);
                System.out.println(temp);
                start = i;
            }
        }
        System.out.println(s.substring(start, s.length()));
    }
}
