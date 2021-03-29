import java.util.Scanner;

public class n3036 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int N=sc.nextInt();
        int[] circle=new int[N];

        for(int i=0;i<N;i++)
            circle[i]=sc.nextInt();

        for(int i=1;i<N;i++){
            int max=gcd(circle[0],circle[i]);
            System.out.println(circle[0]/max+"/"+circle[i]/max);
        }

    }
    public static int gcd(int a,int b){
        while(b!=0){  
            int r=a%b;  

            a=b; 
            b=r; 
        }
        return a;
    }
}
