import java.util.Scanner;

public class n14754 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[][] arr = new long[n][m];
        boolean[][] check = new boolean[n][m];
        long max = 0;
        int x=0, y=0;
        
        for(int i=0;i<n;i++) 
            for(int j=0;j<m;j++)
                arr[i][j] = sc.nextLong();

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(max<arr[i][j]) {
                    max = arr[i][j];
                    x = i;
                    y = j;
                }
            }
            check[x][y] = true;
            max = 0;
        }
        max = 0;
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(max<arr[j][i]) {
                    max = arr[j][i];
                    x = j;
                    y = i;
                }
            }
            check[x][y] = true;
            max = 0;
        }
       
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(check[i][j]==false)
                    max += arr[i][j];
            }
        }
        System.out.println(max);
    }
}
