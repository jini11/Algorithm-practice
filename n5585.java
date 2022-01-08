import java.io.*;

public class n5585 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        n = 1000 - n;
        int[] coin = {500, 100, 50, 10, 5, 1};
        int i = 0;
        int result = 0;
        
        while(n!=0) {
            result += n / coin[i];
            n = n % coin[i++];
        }

        bw.write(result+"\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
