import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2947 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] arr = new int[5];
        for(int i=0;i<5;i++)
            arr[i] = Integer.parseInt(s.split(" ")[i]);
        
        int k = 0;
        for(int i=0;i<4;i++) {
            for(int j=0;j<4;j++) {
                if(arr[j]>arr[j+1]) {
                    k = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = k;
                    for(int num:arr)
                        System.out.print(num+" ");
                    System.out.println();
                }
            }
        }
    }
}
