import java.util.ArrayList;
import java.util.Scanner;

public class n11501 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int t=0;t<T;t++) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
            
            long score = 0;
            long max = 0;
            for(int i=n-1;i>-1;i--) {
                if(max < arr[i])
                    max = arr[i];
                else
                    score += (max - arr[i]);
            }
            
            System.out.println(score);
        }
    }
}
