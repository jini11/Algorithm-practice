import java.util.Arrays;
import java.util.Scanner;

public class n1758 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] tip = new int[n];
        long result = 0;
        int rank = 1;
        for(int i=0;i<n;i++)
            tip[i] = sc.nextInt();
        
        Arrays.sort(tip);

        for(int i=tip.length-1;i>=0;i--) {
            long temp= tip[i] - (rank++ - 1);
            if(temp < 0) temp = 0;
            result += temp;
        }
            System.out.println(result);
    }
}
