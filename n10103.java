import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n10103 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        int cscore = 100;
        int sscore = 100;
        for(int i=0;i<n;i++) {
            String s = br.readLine();
            arr[i][0] = Integer.parseInt(s.split(" ")[0]);
            arr[i][1] = Integer.parseInt(s.split(" ")[1]);
        }
        for(int i=0;i<n;i++) {
            if(arr[i][0] == arr[i][1]) continue;
            if(arr[i][0] > arr[i][1]) sscore -= arr[i][0];
            else cscore -= arr[i][1];
        }
        System.out.println(cscore);
        System.out.println(sscore);
    }
}
