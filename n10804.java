import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n10804 {
    public static void main(String []arg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[21];
        for(int i=1;i<arr.length;i++) 
            arr[i] = i;

        for(int t=0;t<10;t++) {
            String s = br.readLine();
            int a = Integer.parseInt(s.split(" ")[0]);
            int b = Integer.parseInt(s.split(" ")[1]);

            for(int i=0;i<(b-a+1)/2;i++) {
                int temp = arr[i+a];
                arr[i+a] = arr[b-i];
                arr[b-i] = temp;
            }
        }
        for(int i=1;i<=20;i++)
            System.out.print(arr[i]+" ");
    }
}