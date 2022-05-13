import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n10808 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] count = new int[26];
        String input = br.readLine();
        for(int i=0;i<input.length();i++)
            count[(int)input.charAt(i) - 97] += 1;
        for(int i=0;i<count.length;i++)
            System.out.print(count[i]+" ");
    }

}
