import java.io.BufferedReader;
import java.io.InputStreamReader;


public class n1149 {
    static int min=3000;
    static int[][] result;
    static int[][] rgb;
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int N=Integer.parseInt(br.readLine());
        rgb=new int[N][3];
        result=new int[N][3];

        
        for(int i=0;i<N;i++){
            String[] str=br.readLine().split(" ");
            for(int j=0;j<3;j++){
                rgb[i][j]=Integer.parseInt(str[j]);
            }
        }
        result[0][0]=rgb[0][0];
        result[0][1]=rgb[0][1];
        result[0][2]=rgb[0][2];

        System.out.println(Math.min(painting(N-1, 0), Math.min(painting(N-1, 1), painting(N-1, 2))));

    }
    public static int painting(int n,int i){
      if(result[n][i]==0){
        if(i==0){ // 색이 빨간색일 때
           result[n][0]=Math.min(painting(n-1,1),painting(n-1,2))+rgb[n][0];
        }
        else if(i==1){
            result[n][1]=Math.min(painting(n-1,0),painting(n-1,2))+rgb[n][1];
        }
        else if(i==2){
            result[n][2]=Math.min(painting(n-1,0),painting(n-1,1))+rgb[n][2];
        }
    }
        return result[n][i];
    }
}
