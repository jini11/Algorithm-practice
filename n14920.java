import java.util.Scanner;

public class n14920 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(true) {
            if(n == 1) break;
            if(n % 2 == 0) {
                n /= 2;
                count++;
            } else if(n % 2 != 0) {
                n = n * 3 + 1;
                count++;
            }
        }
        System.out.println(count+1);
    }
}
