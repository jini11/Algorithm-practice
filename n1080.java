import java.io.*;
import java.util.Scanner;

public class n1080 {
    static int n = 0;
    static int m = 0;
    static boolean[][] a;
    static boolean[][] b;
    public static void main(String []args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        String str = br.readLine();
        n = Integer.parseInt(str.split(" ")[0]);
        m = Integer.parseInt(str.split(" ")[1]);

        int result = 0;
        a = new boolean[n][m];
        b = new boolean[n][m];

        for(int i=0;i<n;i++) {
            String temp = br.readLine();
            for(int j=0;j<m;j++) {
                if(temp.split("")[j].equals("1"))
                    a[i][j] = true;
                else
                    a[i][j] = false;
            }
        }

        for(int i=0;i<n;i++) {
            String temp = br.readLine();
            for(int j=0;j<m;j++) {
                if(temp.split("")[j].equals("1"))
                    b[i][j] = true;
                else
                    b[i][j] = false;
            }
        }

        if(n<3 || m<3) {
            if(check(a, b)) {
                System.out.println(result);
                return;
            }
            else {
                System.out.println(-1);
                return;
            }
        }

        for(int i=0;i<n-2;i++) {
            for(int j=0;j<m-2;j++) {
                if(a[i][j] != b[i][j]) {
                    change(a, i, j);
                    result++;
                }
            }
        }

        if(check(a, b)==true)
            System.out.println(result);
        else
            System.out.println(-1);
    }

    public static void change(boolean[][] arr, int r, int c) {
        for(int i=r;i<r+3;i++) {
            for(int j=c;j<c+3;j++) {
                arr[i][j] = !arr[i][j];
            }
        }
    }

    public static boolean check(boolean[][] arr1, boolean[][] arr2) {
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(arr1[i][j] != arr2[i][j])
                    return false;
            }
        }
        return true;
    }
}

