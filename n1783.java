import java.util.Scanner;

public class n1783 { //나중에 다시 풀어볼 것
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = 0;

        if(n==1)
            result = 1;
        else if(n==2)
            result = Math.min(4, (m+1)/2);
        else if(m<7)
            result = Math.min(4, m);
        else 
            result = m-2;
        
        System.out.println(result);
    }
}
