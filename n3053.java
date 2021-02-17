import java.io.InputStreamReader;
import java.io.BufferedReader;
public class n3053 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int r=Integer.parseInt(br.readLine());
        
        System.out.printf("%.6f\n",(double)r*(double)r*3.1415926535897932384626433);
        System.out.printf("%.6f\n",2*(double)r*(double)r);
    }
    
}
