import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n2839 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int n=Integer.parseInt(br.readLine());
        int count=0;

        while(true){
            if(n%5==0){
                count+=n/5;
                System.out.println(count);
                break;
            }
            else{
                n-=3;
                count++;
            }
            if(n<0){
                System.out.println(-1);
                break;
            }
        }

       
    }
}
