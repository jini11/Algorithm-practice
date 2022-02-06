import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class n1246 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Integer[] arr = new Integer[m];
        for(int i=0;i<m;i++)
            arr[i] = sc.nextInt();
        long result = 0;
        int cost = 0;
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i=0;i<m;i++) {
            if(i<n) {
                if(arr[i] * (i+1) > result) {
                    result = arr[i] * (i+1);
                    cost = i;
                }
            }
            else
                break;
        }
        System.out.println(arr[cost]+" "+result);
    }
}
