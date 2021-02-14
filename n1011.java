import java.util.Scanner;

public class n1011 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int test=sc.nextInt();
        for(int i=0;i<test;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int count=0;

            count=(y-x-2)/2;
            count+=(y-x-2)%2;
            count+=2;

            System.out.println(count);

        }
    }
    
}
