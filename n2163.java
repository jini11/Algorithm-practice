import java.util.Scanner;

public class n2163 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt = 0;
        cnt = m * n - 1;
        System.out.println(cnt);
    }
}