import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n1904 {
  
    static Integer[] arr;
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int N=Integer.parseInt(br.readLine());
        arr=new Integer[1000001];
        arr[0]=0;
        arr[1]=1;
        arr[2]=2;
        if(N<=2){
            System.out.println(N);
        }
        else{
        int result=tile(N);
        System.out.println(result);
        }
    }
    public static int tile(int n){
        if(arr[n]==null){
            arr[n]=(tile(n-1)+tile(n-2))%15746;
        }
        return arr[n];
    }
}
//n이 0인 경우 배열 할당에 문제가 생겨서..?