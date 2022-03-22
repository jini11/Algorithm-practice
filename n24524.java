import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n24524 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();
        int count = 0;
        int i = 0;
        while(true) {
            if(i>=s.length()) break;
            if(s.contains(t)) {
                count++;
                s = s.replace(t, "");
            }
            i++;
        }
        System.out.println(count);
    }
}
