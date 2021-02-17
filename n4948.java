import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n4948 {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            int n=Integer.parseInt(br.readLine());
            if(n==0)
                break;
            int count=0;
            boolean flag[]=new boolean[2*n+1];
            flag[0]=flag[1]=true;
            
            for(int i=2;i<=2*n;i++){
                if(flag[i]==false){
                    if(i>n)
                        count++;
                    for(int j=i+i;j<=2*n;j+=i)
                        flag[j]=true;    
                }
            }
            System.out.println(count);
        }
    }
}
//13~26
// 13 17 19 23