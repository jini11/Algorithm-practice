import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n18238 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        int result = 0;
        int start = 'A';

        for(int i=0;i<input.length();i++) {
            if(Math.abs(start-input.charAt(i)) < 26 - Math.abs(start-input.charAt(i)))
                result += Math.abs(start-input.charAt(i));
            else
                result += (26 - Math.abs(start-input.charAt(i)));
            start = input.charAt(i);
        }
        System.out.println(result);


    }
}
