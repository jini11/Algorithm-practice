import java.util.*;

public class n5545 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Integer[] arr = new Integer[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int result = c/a;
        
        Arrays.sort(arr, Collections.reverseOrder());

        int price = a;
        int cal = c;
        for(int i=0;i<n;i++) {
            price += b;
            cal += arr[i];
            int temp = cal / price;
            if(result > temp)
                break;
            else
                result = temp;
        }
        System.out.println(result);
    }
}
