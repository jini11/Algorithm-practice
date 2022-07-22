import java.util.Scanner;

public class n1094 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int cnt = 0;
        int stick = 64;
        while(x>0) {
            if(stick>x) stick /= 2;
            else {
                cnt++;
                x -= stick;
            }
        }
        System.out.println(cnt);
    }
}
