import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n1120 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String a = input.split(" ")[0];
        String b = input.split(" ")[1];

        int result = Integer.MAX_VALUE;
        for(int i=0;i<=b.length()-a.length();i++) {
            int temp = 0;
            for(int j=0;j<a.length();j++) {
                if(a.charAt(j) != b.charAt(j+i)) temp++;
            }
            result = Math.min(result, temp);
        }
        System.out.println(result);
    }   
}
