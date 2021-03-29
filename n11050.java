import java.util.Scanner;

public class n11050 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int a=sc.nextInt();
        int b=sc.nextInt();
              
        
       
        System.out.println(factorial(a)/(factorial(b)*factorial(a-b)));
    }
    public static int factorial(int n){
        if(n==0)
            return 1;
        
        return n*factorial(n-1);
    }
}
