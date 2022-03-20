import java.util.Scanner;

public class n9625 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[46];
        int[] b = new int[46];
        int k = sc.nextInt();
        a[0] = 1;
        b[0] = 0;
        a[1] = 0;
        b[1] = 1;
        for(int i=2;i<=k;i++) {
            a[i] = a[i-1] + a[i-2];
            b[i] = b[i-1] + b[i-2];
        }
        
        System.out.println(a[k]+" "+b[k]);
    }
}
