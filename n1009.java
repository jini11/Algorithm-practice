import java.util.Scanner;

public class n1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int t=0;t<T;t++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int total = 1;
            for(int i=0;i<b;i++)
                total = (a * total) % 10;

            if(total == 0)
                total = 10;
            
            System.out.println(total);
        }
    }
}
