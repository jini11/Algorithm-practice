import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n12018 {
    public static void main(String []args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String temp = br.readLine();
        int n = Integer.parseInt(temp.split(" ")[0]);
        int m = Integer.parseInt(temp.split(" ")[1]);
        int[] sub = new int[n];
        int[] full = new int[n];
        for(int i=0;i<n;i++) {
            String num = br.readLine();
            sub[i] = Integer.parseInt(num.split(" ")[0]);
            full[i] = Integer.parseInt(num.split(" ")[1]);
            
        }
    }
}
