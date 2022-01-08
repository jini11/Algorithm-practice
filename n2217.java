import java.io.*;
import java.util.Arrays;

public class n2217 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());
        int[] arr = new int[k];
        int w = 0;
        for(int i=0;i<k;i++)
            arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        for(int i=0;i<k;i++) {
            if( w < arr[i] * (k-i) ) {
                w = arr[i] * (k-i);
            }
        }
        if( w < arr[arr.length-1])
            w = arr[arr.length-1];
        
        bw.write(w+"\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
