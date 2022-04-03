import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class n11656 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] arr = new String[s.length()];
        
        for(int i=0;i<arr.length;i++)
            arr[i] = s.substring(i, s.length());
        
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
}
