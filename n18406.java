import java.util.Scanner;

public class n18406 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int left = 0, right = 0;
        for(int i=0;i<s.length();i++) {
            if(i < s.length()/2)
                left += s.charAt(i) - '0';
            else
                right += s.charAt(i) - '0';
        }

        if(left == right)
            System.out.println("LUCKY");
        else
            System.out.println("READY");
    }
}
