import java.util.Scanner;

public class n2747 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt();		
        int F1=0, F2=1, F3=1;
        for(int i=2; i<=n; i++) {
            F3=F1+F2;
            F1=F2;
            F2=F3;
        }		
        System.out.println(F3);
    }
}
