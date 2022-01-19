import java.util.Arrays;
import java.util.Scanner;

public class n1449 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] location = new int[n];
        int result = 0;
        for(int i=0;i<n;i++) {
            location[i] = sc.nextInt();
        }

        Arrays.sort(location);
        boolean[] arr = new boolean[location[location.length-1]+1];
        for(int i=0;i<n;i++) {
            if(!arr[location[i]]) { 
                for(int j=location[i];j<Math.min(location[i]+l, location[location.length-1]+1);j++)
                    arr[j] = true;
                result++;
            }
        }
        System.out.println(result);
    }
}
