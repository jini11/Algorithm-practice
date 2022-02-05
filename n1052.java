import java.util.Scanner;

public class n1052 { // 다시 풀어보기
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = 0;

        if(n<=k)
            result = 0;
        else {
            while(true) {
                int temp = 0;
                int num = n;
                while(num!=0) {
                    if(num%2==1)
                        temp++;
                    num = num/2;
                }
                if(temp <= k)
                    break;
                result++;
                n++;
            }
        }
        System.out.println(result);


    }
}
