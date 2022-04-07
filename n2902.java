import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2902 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String result = "";
        result += line.charAt(0);
        for(int i=1;i<line.length()-1;i++) {
            if(line.charAt(i) == '-')
                result += line.charAt(i+1);
        }
        System.out.println(result);
    }
}
