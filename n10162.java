import java.io.*;

public class n10162 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sec = Integer.parseInt(br.readLine());
        int[] bt = {300, 60, 10};
        Integer[] result = new Integer[3];

        for(int i=0;i<3;i++) {
            result[i] = sec / bt[i];
            sec = sec % bt[i];
        }

        if(sec!=0)
            bw.write("-1\n");
        else
            bw.write(result[0]+" "+result[1]+" "+result[2]+"\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
