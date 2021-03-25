import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class n13305 {
    public static int result=0;
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int N=Integer.parseInt(br.readLine());

        String[] k=br.readLine().split(" ");
        String[] l=br.readLine().split(" ");
        

        int[] liter=new int[N];
        int[] km=new int[N-1];

        for(int i=0;i<liter.length;i++)
            liter[i]=Integer.parseInt(l[i]);

        for(int i=0;i<km.length;i++)
            km[i]=Integer.parseInt(k[i]);

        for(int i=0;i<liter.length-2;i++){
            if(liter[i]<liter[i+1]){
                result+=(liter[i]*(km[i]+km[i+1]));
                km[i+1]=0;
            }
            else{
                result+=(liter[i]*km[i]);
            }
        }
        System.out.println(result);
    }
}
