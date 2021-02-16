import java.util.Scanner;

public class n1011 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int test=sc.nextInt();
       
        for(int i=0;i<test;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();

            int distance=y-x-2;
            int count=2;
            int jump=1;
           
            while(true){
                if(distance==0)
                    break;
                
               
                
                if(distance<0){
                    distance+=jump+1;
                    jump-=1;
                    count--;
                }
                else{
                    distance-=(jump+1);
                    count++;
                    jump++;
                }
            }
            System.out.println(count);
        }
    }
    
}
