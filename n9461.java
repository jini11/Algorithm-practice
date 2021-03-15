import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n9461 {
    static long[] arr=new long[101];
    public static void main(String[] args) throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        
        int T=Integer.parseInt(br.readLine());
        
        int[] cases=new int[T];
        arr[1]=1;
        arr[2]=1;
        arr[3]=1;

        for(int i=0;i<T;i++){
            cases[i]=Integer.parseInt(br.readLine());
            for(int j=4;j<=cases[i];j++)
                arr[j]=arr[j-2]+arr[j-3];
            System.out.println(arr[cases[i]]);
        }
        
        
    }
   
}
