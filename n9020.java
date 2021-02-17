import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n9020 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int test=Integer.parseInt(br.readLine());
       
       boolean[] flag=new boolean[10001];
       flag[0]=flag[1]=true;
       for(int i=2;i<10000;i++){
           for(int j=i+i;j<=10000;j+=i)
                flag[j]=true;//소수 판별
       }

        for(int i=0;i<test;i++){
            int num=Integer.parseInt(br.readLine());

            int a=num/2;
            int b=num/2;

            while(true){
                if(!flag[a]&&!flag[b])
                    break;
                a--;
                b++;    
            }
            System.out.println(a+" "+b);
        }
    }
}
