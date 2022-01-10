import java.io.*;

public class n1789 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long s = Long.parseLong(br.readLine());

        long i = 1;
        long sum = 1;
        while(sum<s) {
            i++;
            sum += i;
        }
        if(sum>s)
            i--;

        bw.write(i+"\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
