import java.util.Scanner;

public class n9507 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0;t<T;t++) {
            int n = sc.nextInt();
            long[] arr = new long[n+4];
            arr[0] = 1;
            arr[1] = 1;
            arr[2] = 2;
            arr[3] = 4;
            if(n>3) {
                for(int i=4;i<=n;i++)
                    arr[i] = arr[i-1] + arr[i-2] + arr[i-3] + arr[i-4];
            }
            System.out.println(arr[n]);
        }
    }
}
