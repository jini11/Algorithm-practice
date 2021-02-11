import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n2908 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        String s=br.readLine();
        String ws="";

       for(int i=s.length()-1;i>=0;i--)
            ws+=s.charAt(i);
  
        int a=Integer.parseInt(ws.split(" ")[0]);
        int b=Integer.parseInt(ws.split(" ")[1]);

        if(a<b)
            System.out.println(b);
        else
            System.out.println(a);
    }
}
