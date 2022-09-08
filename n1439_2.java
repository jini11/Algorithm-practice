import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n1439_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int zero = 0, one = 0;

        if(s.charAt(0) == '0') zero++;
        else one++;
        
        for(int i=0;i<s.length()-1;i++) {
            if(s.charAt(i) != s.charAt(i+1)) {
                if(s.charAt(i) == '0') one++;
                else zero++;
            }
        }

        System.out.println(Math.min(one, zero));
    }
}
