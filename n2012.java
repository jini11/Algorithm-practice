import java.util.Arrays;
import java.util.Scanner;

public class n2012 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        long cnt = 0;
        int score = 1;
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        
        Arrays.sort(arr);

        for(int i=0;i<n;i++) {
            if(arr[i] != score) {
                cnt += Math.abs(score-arr[i]);
            }
            score++;
        }
        System.out.println(cnt);
    }
}
