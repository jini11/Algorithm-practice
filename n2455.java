import java.util.Scanner;

public class n2455 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][2];
        int count = 0;
        int result = 0;
        for(int i=0;i<4;i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            count = count - arr[i][0] + arr[i][1];
            result = Math.max(result, count);
        }
        System.out.println(result);
    }
}
