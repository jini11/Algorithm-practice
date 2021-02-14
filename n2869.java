import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n2869 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

     
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int A=Integer.parseInt(st.nextToken());
        int B=Integer.parseInt(st.nextToken());
        int V=Integer.parseInt(st.nextToken());
        
        int count=0;
        if((V-B)%(A-B)!=0)
            count++;
            
        System.out.println((V-B)/(A-B)+count);

    }

    
}

// x(a-b)>=v
// x>=v/(a-b)