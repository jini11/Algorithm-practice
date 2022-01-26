import java.util.Scanner;

public class n2828 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int j = sc.nextInt();
        int result = 0;
        int left = 1;
        int right = m;

        for(int i=0;i<j;i++) {
            int apple = sc.nextInt();
            if(apple > right) {
                result += apple - right;
                right = apple;
                left = apple - (m - 1);
            } 
            else if(apple < left) {
                result += left - apple;
                left = apple;
                right = apple + (m - 1);
            }    
        }
        System.out.println(result);
    }
}
