import java.util.Scanner;

public class n5086 {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        
        int a=1;
        int b=1;
        String str;
      
        while(true){
            str="";
          
            a=sc.nextInt();
            b=sc.nextInt();

            if(a==0 && b==0)
                break;
                
            for(int i=0;i<Math.max(a, b);i++){
                if(a*i==b)
                    str="factor";
                else if(b*i==a)
                    str="multiple";
            }
            if(str=="")
                System.out.println("neither");
            else
                System.out.println(str);
        }
    }
}
