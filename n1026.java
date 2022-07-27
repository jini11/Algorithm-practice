import java.io.*;
import java.util.*;

public class n1026 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        Integer[] b = new Integer[n];

        String str1 = br.readLine();
        String str2 = br.readLine();

        for(int i=0;i<n;i++) {
            a[i] = Integer.parseInt(str1.split(" ")[i]);
            b[i] = Integer.parseInt(str2.split(" ")[i]);    
        }

        Arrays.sort(a);
        //Arrays.sort(b, Collections.reverseOrder());

        int result = 0;
        for(int i=0;i<n;i++) {
            result += a[i] * b[i];
        }

        bw.write(result+"\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
