import java.util.*;

public class n1417 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n-1];
        int result = 0;
        int dasom = sc.nextInt();
        if(n==1) {
            System.out.println(0);
            return;
        }
        for(int i=0;i<arr.length;i++)
            arr[i] = sc.nextInt();       

        while(true) {
            Arrays.sort(arr, Collections.reverseOrder());
            if(dasom > arr[0])
                break;
            dasom++;
            arr[0]--;
            result++;
        }
        System.out.println(result);
    }
}
