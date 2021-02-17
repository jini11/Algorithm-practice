import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n11653 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int num=Integer.parseInt(br.readLine());

        for(int i=2;i<=num;i++){
            if(num%i==0){
                num=num/i;
                System.out.println(i);
                i=1;
            }
         
        }
        
    }
}
