import java.util.Scanner;

public class n16395 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] arr = new int[31][31];
        arr[1][1] = 1;
        arr[2][1] = 1;
        arr[2][2] = 1;

        for(int i=3;i<n+1;i++) {
            for(int j=1;j<i+1;j++) {
                if(j==1 || j==i) arr[i][j] = 1;
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }
        System.out.println(arr[n][k]);
    }
}
