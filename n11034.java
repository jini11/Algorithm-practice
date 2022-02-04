import java.util.Scanner;

public class n11034 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int result = Math.max(b-a, c-b);
            System.out.println(result-1);
        }
    }
}
