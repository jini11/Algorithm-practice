import java.util.Scanner;
public class n5565 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        for(int i=0;i<9;i++)
            sum -= sc.nextInt();
        System.out.println(sum);
        sc.close();
    }
}
