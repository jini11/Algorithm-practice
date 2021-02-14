import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n1193 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int num=Integer.parseInt(br.readLine());

        int direction=1;
        int nume=1;//분자
        int deno=1;//분모
        int result=1;

        while(true){           
            if(direction==1){//홀일 때
                if(result>=num)
                break;
               
                deno++;
                result++;
               
                for(int i=deno;i>1;i--){
                    if(result>=num)
                    break;

                    nume++;
                    deno--;
                    result++;
                }
                direction=-1;
            }
             else if(direction==-1){//짝
                if(result>=num)
                break;
               
                nume++;
                result++;
                
                for(int i=nume;i>1;i--){
                    if(result>=num)
                    break;

                    nume--;
                    deno++;
                    result++;
                   
                }
                direction=1;
            }  
        }
        System.out.println(nume+"/"+deno);
    }
}
