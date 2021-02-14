import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n10250 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(br.readLine());
        
        int[][] arr=new int[test][3];
        int[] result=new int[test];

        for(int i=0;i<test;i++){
        StringTokenizer st=new StringTokenizer(br.readLine());
        arr[i][0]=Integer.parseInt(st.nextToken()); //H
        arr[i][1]=Integer.parseInt(st.nextToken()); //W
        arr[i][2]=Integer.parseInt(st.nextToken()); //N

        if(arr[i][2]%arr[i][0]==0){
            result[i]=arr[i][0]*100+arr[i][2]/arr[i][0];
        }
        else{
            result[i]=arr[i][2]%arr[i][0]*100+arr[i][2]/arr[i][0]+1;
        }
       // result[i]=(arr[i][2]%arr[i][0]==0?arr[i][0]*100:(arr[i][2]%arr[i][0])*100 )+ (arr[i][2]%arr[i][0]==0?arr[i][2]/arr[i][0]:arr[i][2]/arr[i][0]+1);        
        }

        for(int i=0;i<test;i++)
        System.out.println(result[i]);
    }
}
