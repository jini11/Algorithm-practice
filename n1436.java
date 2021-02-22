import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n1436 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int count=0;
        int result=0;
        while(n>0){
            count++;
            if(Integer.toString(count).contains("666"))
            n--;
        }
        System.out.println(count);
    }
}
