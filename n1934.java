import java.util.Scanner;

public class n1934 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int N=sc.nextInt();

       for(int i=0;i<N;i++){
        int a=sc.nextInt();
        int b=sc.nextInt();

        int aa=a;
        int bb=b;

        while(b!=0){  //24 18   //18 6
            int r=a%b;  //r=6   //r=0

            a=b; //a=18         //a=6
            b=r; //b=6          //b=0
        }

        System.out.println(aa*bb/a); //최소공배수: 24*18/6
       }
    }
}
