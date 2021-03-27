import java.util.Scanner;

public class n2609 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

         int m = sc.nextInt();
        int n = sc.nextInt();
        int min = 1;
        int mx=m;
        int nx=n;
        
        int i=2;
        while (true) {
            if(i>m && i>n)
                break;

            if (m % i == 0 && n % i == 0) {
                min *= i;
                m = m / i;
                n = n / i;
                i = 2;
                
            }
            else
              i++; 
        }

        System.out.println(min);
        System.out.println(mx*nx/min); //최소공배수 공식

    }
}

