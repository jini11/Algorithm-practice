import java.util.Scanner;

public class n3135 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        
        int min = Math.abs(a-b);
        for(int i=0;i<n;i++) {
            if(min > Math.abs(b-arr[i]))
                min = Math.abs(b-arr[i]);
        }
        if(min==0)
            System.out.println(1);
        else if(min==Math.abs(a-b))
            System.out.println(min);
        else
            System.out.println(min+1);
    }
} 
