import java.util.Scanner;

public class n9251 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int[][] arr = new int[a.length()+1][b.length()+1];

        for(int i=1;i<=a.length();i++) {
            for(int j=1;j<=b.length();j++) {
                if(a.charAt(i-1) == b.charAt(j-1)) {
                    arr[i][j] = arr[i-1][j-1] +1;
                } else {
                    arr[i][j] = Math.max(arr[i-1][j], arr[i][j-1]);
                }
            }
        }
        System.out.println(arr[a.length()][b.length()]);
    }
}
