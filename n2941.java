import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n2941 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String[] alpha={"c=","c-","dz=","d-","lj","nj","s=","z="};

        String input=br.readLine();
  
        for(int i=0;i<alpha.length;i++){
            if(input.contains(alpha[i])){
                input=input.replace(alpha[i], " ");
           
            }
        }
        
        System.out.println(input.length());
    }
}

