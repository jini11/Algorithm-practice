import java.io.*;

public class n11047_2 {
    public static void main(String []args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int num = Integer.parseInt(input.split(" ")[0]);
        int price = Integer.parseInt(input.split(" ")[1]);
        int[] mon = new int[num];
        int result = 0;

        for(int i=0;i<mon.length;i++) 
            mon[i] = Integer.parseInt(br.readLine());

        for(int i=mon.length-1; i>=0; i--) {
            result += price / mon[i];
            price = price % mon[i];
            if(price == 0)
                break;
        }
        bw.write(result+"\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
