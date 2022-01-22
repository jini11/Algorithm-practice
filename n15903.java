import java.io.*;
import java.util.*;

public class n15903 {
    public static void main(String []args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] arr = new long[n];
        long result = 0;
        for(int i=0;i<arr.length;i++)
            arr[i] = sc.nextLong();
        
        for(int i=0;i<m;i++) {
            Arrays.sort(arr);

            long temp = arr[0] + arr[1];
            arr[0] = temp;
            arr[1] = temp;
        }

        for(int i=0;i<arr.length;i++)
            result += arr[i];
        
        System.out.println(result);
    }
}
