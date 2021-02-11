import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n1152 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String s=br.readLine();
       
        int count=0;
        StringTokenizer st=new StringTokenizer(s," ");
        
        System.out.println(st.countTokens());
        
        br.close();
    }
}
