import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n2292 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int num=Integer.parseInt(br.readLine());

        int count=1;
        int n=2;
      

            while(n<=num){
                n+=(6*count);
                count++;
            }
        
        System.out.println(count);
       
    }
    
}
