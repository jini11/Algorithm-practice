import java.util.Scanner;

public class n14916 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n>0) {
            if(n%5==0) {
                count = n/5 + count;
                break;
            }
            n -= 2;
            count++;
        }
        if(n<0)
            System.out.println(-1);
        else
            System.out.println(count);
    }
}
