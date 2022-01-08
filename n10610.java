import java.io.*;
import java.util.*;

public class n10610 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long result = 0;
        String n = br.readLine();
        String[] arr = n.split("");

        int[] num = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(num);

        for(int i=0;i<num.length;i++) {
            long temp = (long) (num[i] * Math.pow(10, i));
            result += temp;
        }

        if(result%30==0&&n.contains("0"))
            bw.write(result+"\n");
        else
            bw.write("-1\n");
        
        br.close();
        bw.flush();
        bw.close();
    }
}
