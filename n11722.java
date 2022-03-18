import java.util.Scanner;

public class n11722 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] count = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        count[0] = 1;
        for(int i=1;i<n;i++) {
            count[i] = 1;
            for(int j=0;j<i;j++) {
                if(arr[i] < arr[j] && count[i] <= count[j])
                    count[i] = count[j] + 1;
                else if(arr[i] == arr[j])
                    count[i] = count[j];
            }
        }
        int max = 0;
        for(int i=0;i<n;i++)
            max = Math.max(max, count[i]);
        System.out.println(max);
    }
}
