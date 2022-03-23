import java.util.Scanner;

public class n2502 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int k = sc.nextInt();
        if(d==3) {
            System.out.println(1+"\n"+(k-1));
            return;
        }
        int[] x = new int[d+1];
        int[] y = new int[d+1];
        x[3] = 1;
        y[3] = 1;
        x[4] = 1;
        y[4] = 2;
        for(int i=5;i<=d;i++) {
            x[i] = x[i-1] + x[i-2];
            y[i] = y[i-1] + y[i-2]; 
        }
        int a = 1;
        int b;
        while(true) {
            if((k- x[d] * a) % y[d] == 0) {
                b = (k- x[d] * a) / y[d];
                break;
            }
            a++;
        }
        System.out.println(a+"\n"+b);
    }
}
