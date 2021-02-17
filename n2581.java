import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n2581 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int M=Integer.parseInt(br.readLine());
        int N=Integer.parseInt(br.readLine());
        int min=Integer.MAX_VALUE;
        int result=0;
        for(int i=M;i<=N;i++){
            boolean flag=true;
            if(i==1)
                flag=false;
            for(int j=2;j<i;j++){
                if(i%j==0)
                    flag=false;

            }
            if(flag==true){
                if(min==Integer.MAX_VALUE)
                    min=i;
                result+=i;    
            }
        }
        if(result<=0)
            System.out.println(-1);
        else{
            System.out.println(result+"\n"+min);
        } 
    }
}
