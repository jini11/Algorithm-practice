import java.util.Scanner;

public class n1978 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int test=sc.nextInt();
        int count=0;
        
        for(int i=0;i<test;i++){
            boolean flag=true;
            int num=sc.nextInt();

            if(num==1)
                flag=false;
            else{    
            for(int j=2;j<num;j++){
                if(num%j==0)
                    flag=false;
            }
        }
            if(flag==true)
             count++;
        }
        System.out.println(count);
    }
    
}
