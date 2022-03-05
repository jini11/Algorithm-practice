import java.util.Scanner;

public class n1476 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int E = 1, S = 1, M = 1, count = 0;
        int e = sc.nextInt();
        int s = sc.nextInt();
        int m = sc.nextInt();
        while(true) {
            if(e==E && s==S && m==M) break;
            count++;
            E += 1;
            S += 1;
            M += 1;
            if(E==16) E = 1;
            if(S==29) S = 1;
            if(M==20) M = 1;
        }
        System.out.println(count+1);
    }
}
