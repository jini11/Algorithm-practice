import java.util.Scanner;

public class n13458 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] student = new int[n];
        for(int i=0;i<n;i++) 
            student[i] = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        long result = 0;
        for(int i=0;i<n;i++) {
            if(student[i]<=b) {
                result++;
                continue;
            } else {
                result++;
                student[i] -= b;
                if(student[i] % c == 0)
                    result += student[i] / c;
                else if(student[i] % c != 0)
                    result += student[i] / c + 1;
            }
        }
        System.out.println(result);
    }
}