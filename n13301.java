import java.util.Scanner;

public class n13301 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n+2];
        arr[1] = 4;
        arr[2] = 6;
        if(n>2) {
            for(int i=3;i<=n;i++)
                arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println(arr[n]);
    }
}
