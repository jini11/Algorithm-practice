import java.util.Scanner;

public class n19539 { // 다시 풀어볼 것
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum_2 = 0, sum_3 = 0;
        for(int i=0;i<n;i++) {
            int h = sc.nextInt();
            sum_3 += h;
            sum_2 += (h/2);
        }
        if(sum_3 % 3 == 0) {
            if(sum_2 >= sum_3/3)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        else System.out.println("NO");
    }
    
}
