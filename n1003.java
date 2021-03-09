import java.io.BufferedReader;
import java.io.InputStreamReader;


public class n1003 {
   
    static Integer[][] fibo=new Integer[41][2]; //Integer형 배열은 초기화가 null임.
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        

        //초기화
        fibo[0][0]=1; //n=0 일 때, 0의 횟수
        fibo[0][1]=0; //n=0 일 때, 1의 횟수
        fibo[1][0]=0; //n=1 일 때, 0의 횟수
        fibo[1][1]=1; //n=1 일 때, 1의 횟수

        int num=Integer.parseInt(br.readLine());
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=Integer.parseInt(br.readLine());
            fibonacci(arr[i]);
            System.out.println(fibo[arr[i]][0]+" "+fibo[arr[i]][1]);
        }

    }
    public static Integer[] fibonacci(int n){
        if(fibo[n][0]==null||fibo[n][1]==null){ //fibo 배열형이 Integer이어야 실행 가능
        fibo[n][0]=fibonacci(n-1)[0]+fibonacci(n-2)[0];
        fibo[n][1]=fibonacci(n-1)[1]+fibonacci(n-2)[1];
        }
        return fibo[n];
    }
}
