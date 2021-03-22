import java.io.BufferedReader;
import java.io.InputStreamReader;


public class n1932 {
    public static int[][] arr=new int[5][];
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            String[] str=br.readLine().split(" ");
            for(int j=0;j<n;j++){
                arr[i][j]=Integer.parseInt(str[j]);
            }
        }

        System.out.println(triangle(0,0));
    }
    public static int triangle(int n,int m){
        
    }
}
