import java.util.Scanner;

public class n14659 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 0;
        int result = Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        for(int i=0;i<n;i++) {
            cnt = 0;
            for(int j=i+1;j<n;j++) {
                if(arr[i]> arr[j]) cnt++;
                else break;
            }
            result = Math.max(result, cnt);
        }
        System.out.println(result);
    }
}
