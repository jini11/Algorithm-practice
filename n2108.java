import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class n2108 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());
        int[] arr=new int[n];

        int sum=0;

        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(br.readLine());

        //산술평균
        for(int i=0;i<n;i++)
            sum+=arr[i];
        System.out.println((int)Math.round((double)sum/n));

        //중앙값
        Arrays.sort(arr);
        System.out.println(arr[arr.length/2]);

        //최빈값
        int[] check=new int[8001];
        boolean key=true;
        for(int i=0;i<n;i++){
            check[arr[i]+4000]++;
        }
        int mode=check[arr[0]+4000];
        int result=0;
        int count=0;
        for(int i=arr[0]+4000;i<check.length;i++){
            if(mode==check[i]&&key==true){
                mode=check[i];
                result=i;
                count++;
                if(count==2)
                key=false;
            }
            if(mode<check[i]){
                mode=check[i];
                result=i;
            }
          
        }
        System.out.println(result-4000);

        //범위
        System.out.println(arr[arr.length-1]-arr[0]);
    }
}
