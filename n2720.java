import java.io.*;

public class n2720 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        
        for(int i=0;i<t;i++) {
            int[] result = new int[4];
            int c = Integer.parseInt(br.readLine());

            result[0] = c / 25;
            c = c % 25;

            result[1] = c / 10;
            c = c % 10;

            result[2] = c / 5;
            result[3] = c % 5;

            System.out.println(result[0]+" "+result[1]+" "+result[2]+" "+result[3]);
        }
        
        
    }
}
