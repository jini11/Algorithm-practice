import java.io.IOException;
import java.util.Scanner;

public class n11048 {
    public static void main(String []args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n+1][m+1];
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=m;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=m;j++) {
                arr[i][j] += Math.max(arr[i][j-1], Math.max(arr[i-1][j], arr[i-1][j-1]));
            }
        }
        System.out.println(arr[n][m]);
    }
}
