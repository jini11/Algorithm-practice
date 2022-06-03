import java.io.IOException;
import java.util.Scanner;

public class n10811 {
    public static void main(String []args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] bucket = new int[n];
        for(int i=0;i<n;i++)
            bucket[i] = i+1;
        for(int i=0;i<m;i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            while(a<b) {
                int tmp = bucket[a];
                bucket[a++] = bucket[b];
                bucket[b--] = tmp;
            }
        }
        for(int i=0;i<n;i++)
            System.out.print(bucket[i]+" ");

    }
}
