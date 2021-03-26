import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class n2609 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        // int m=Integer.parseInt(br.readLine().split(" ")[0]);
        // int n=Integer.parseInt(br.readLine().split(" ")[1]);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int great = 1;

        int max = Math.max(m, n);
        int i=2;
        while (true) {
            if(i==max)
                break;

            if (m % i == 0 && n % i == 0) {
                great *= i;
                m = m / i;
                n = n / i;
                i = 2;
                max=Math.max(m,n);
            }
            i++; 
        }

        System.out.println(great);
        System.out.println(great * m * n);

    }
}
