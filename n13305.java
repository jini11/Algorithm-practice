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

        result=liter[0]*km[0];
        
       /* for(int i=0;i<N-2;i++){
            if(liter[i]<liter[i+1]){
                result+=(liter[i]*km[i+1]);
                
            }
            else{
                result+=(liter[i+1]*km[i+1]);
            }
        }
        */
        int nowCity = 0;
		int nextCity = nowCity + 1;
		
		
		while(nextCity < N- 1) {
			if(liter[nowCity] < liter[nextCity]) {
				result += liter[nowCity] * km[nextCity];
			}
			else {
				result += liter[nextCity] * km[nextCity];
				nowCity = nextCity;
			}
			
			nextCity++;
		}
        System.out.println(result);
    }
}
