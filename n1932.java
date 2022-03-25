import java.util.Scanner;

public class n1932 {
    static int[][] arr;
    static int[][] count;
    static int n;
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];
        count = new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<=i;j++) {
                arr[i][j] = sc.nextInt();
                if(i==n-1) {
                    count[i][j] = arr[i][j];
                }
            }
        }
        System.out.println(triangle(0, 0));
    }
    public static int triangle(int x, int y) {
        if(x == n-1) return count[x][y];
        if(count[x][y] == 0) {
            count[x][y] = Math.max(triangle(x+1, y), triangle(x+1, y+1)) + arr[x][y];
        }
        return count[x][y];
    }
}
