import java.io.*;
import java.util.Arrays;

public class n11399_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result = 0;
        int total = 0;
        int n = Integer.parseInt(br.readLine());
        String[] sarr = new String[n];
        
        sarr = br.readLine().split(" ");
        int[] arr = Arrays.stream(sarr).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(arr);
            
        for(int i=0;i<arr.length;i++) {
            total += arr[i];
            result += total;
        }
        
        bw.write(result+"\n");
        
        br.close();
        bw.flush();
        bw.close();
    }
}
