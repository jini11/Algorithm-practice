import java.util.Scanner;

public class n11052 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        int[] count = new int[n+1];
        for(int i=1;i<=n;i++)
            arr[i] = sc.nextInt();
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++)
                count[i] = Math.max(count[i], arr[j]+count[i-j]);
        }
        System.out.println(count[n]);
    }
}
