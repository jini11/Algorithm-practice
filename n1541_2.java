import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.*;
import java.util.Arrays;

public class n1541_2 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] arr = str.split("-");
        int result = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i].contains("+")) {
                String[] plus = arr[i].split("\\+");
                int temp = 0;
                for(int j=0;j<plus.length;j++)
                    temp += Integer.parseInt(plus[j]); 
                arr[i] = Integer.toString(temp);
            }
        }
        int[] minus = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();

        result = minus[0];
        for(int i=1;i<minus.length;i++) {
            result -= minus[i];
        }
        bw.write(result+"\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
