import java.util.Scanner;

public class n10156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(m-(k*n) <= 0)
            System.out.println(Math.abs(m-(k*n)));
        else
            System.out.println(0);
    }
}
