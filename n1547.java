import java.util.Scanner;

public class n1547 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int cup = 1;
        for(int i=0;i<m;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(cup == a)
                cup = b;
            else if(cup == b)
                cup = a;
        }
        System.out.println(cup);
    }
}