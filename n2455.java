import java.util.Scanner;

public class n2455 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][2];
        for(int i=0;i<4;i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        int count = arr[0][1];
        for(int i=1;i<4;i++) {
            count = Math.max(count, count-arr[i][0]+arr[i][1]);
        }
        System.out.println(count);
    }
}
