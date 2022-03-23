import java.util.Scanner;

public class n13699 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[36];
        arr[0] = 1;
        arr[1] = 1;
        
        for(int i=2;i<36;i++)
            for(int j=0;j<i;j++)
                arr[i] += (arr[j] * arr[i-1-j]);
        
        System.out.println(arr[n]);
    }
}
