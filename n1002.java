import java.util.Scanner;

public class n1002 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        for(int i=0;i<test;i++){
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int r1=sc.nextInt();
            int x2=sc.nextInt();
            int y2=sc.nextInt();
            int r2=sc.nextInt();

            int distance=(int)(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));

            if(x1==x2&&y1==y2&&r1==r2) //겹칠 때(-1)
                System.out.println(-1);
            else if(Math.pow(r1+r2,2)<distance||Math.pow(r1-r2, 2)>distance) // 원이 떨어져 있을 때(0), 원이 내접해서 떨어져 있을 때(0)
                System.out.println(0);
            else if(Math.pow(r1+r2, 2)==distance||Math.pow(r1-r2, 2)==distance)//외접해 있을 때, 내접해 있을 때(1)
                System.out.println(1);
            else 
                System.out.println(2);
        }
    }
}
