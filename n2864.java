import java.util.Scanner;

public class n2864 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        a = a.replaceAll("6","5");
        b = b.replaceAll("6","5");

        int min = Integer.parseInt(a) + Integer.parseInt(b);

        a = a.replaceAll("5","6");
        b = b.replaceAll("5","6");

        int max = Integer.parseInt(a) + Integer.parseInt(b);

        System.out.println(min+" "+max);
    }
}
