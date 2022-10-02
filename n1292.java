import java.util.Scanner;

public class n1292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;

        int[] arr = new int[1001];
        int idx = 1;

        for(int i=1;i<=1000;i++) {
            for(int j=0;j<i;j++) {
                if(idx >= 1001) break;
                arr[idx++] = i;
            }
        }

        for(int i=a;i<=b;i++)
            sum += arr[i];
        System.out.println(sum);
    }
}