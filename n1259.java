import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String input = br.readLine();
            String answer = "yes";
            if(input.equals("0"))
                break;
            for(int i=0;i<input.length()/2;i++) {
                if(input.charAt(i) != input.charAt(input.length()-i-1)) {
                    answer = "no";
                    break;
                }
            }
            System.out.println(answer);
        }
    }
}
 