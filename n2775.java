import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n2775 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int test=Integer.parseInt(br.readLine());
   
        int[][] arr=new int[15][15];

        for(int i=0;i<arr.length;i++){
            arr[i][1]=1;
            arr[0][i]=i;
        }
        for(int i=1;i<arr.length;i++){
            for(int j=2;j<arr[i].length;j++){
                arr[i][j]=arr[i-1][j]+arr[i][j-1];
            }
        }
        for(int i=0;i<test;i++){
            int k=Integer.parseInt(br.readLine());
            int n=Integer.parseInt(br.readLine());
            System.out.println(arr[k][n]);
        }
    }
}
