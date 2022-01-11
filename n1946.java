import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class n1946 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        
        for(int i=0;i<t;i++) {
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][2];
            int result = 1;
            for(int j=0;j<n;j++) {
                String str = br.readLine();
                arr[j][0] = Integer.parseInt(str.split(" ")[0]);
                arr[j][1] = Integer.parseInt(str.split(" ")[1]);
            }
            Arrays.sort(arr, Comparator.comparingInt(o1 -> o1[0]));

            int max = arr[0][1];
            for(int j=1;j<n;j++) {
                if(arr[j][1] < max) {
                    max = arr[j][1];
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}
