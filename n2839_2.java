import java.util.Scanner;

public class n2839_2 {
    public static void main(String []args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int result = 0;
            
            while(true) {

                if(n % 5 == 0) {
                    result += n / 5;
                    n = n % 5;
                    break;
                }
                else {
                    n -= 3;
                    result++;
                }

                if(n < 0) {
                    result = -1;
                    break;
                }
            }
            
            System.out.println(result);
        }
    }
}
