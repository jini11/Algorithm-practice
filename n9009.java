import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class n9009 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        long[] fibo = new long[45];
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i=2;i<fibo.length;i++)
            fibo[i] = fibo[i-1] + fibo[i-2];
        
        for(int t=0;t<T;t++) {
            int n = sc.nextInt();
            ArrayList<Long> arr = new ArrayList<>();
            for(int i=fibo.length-1;i>0;i--) {
                if(fibo[i] <= n) {
                    n -= fibo[i];
                    arr.add(fibo[i]);
                }
            }
            Collections.sort(arr);
            for(int i=0;i<arr.size();i++)
                System.out.print(arr.get(i)+" ");
            System.out.println();
        }
    }
}
