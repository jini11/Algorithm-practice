import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class n1929 {
    public static void main(String[] args)  {
        
        Scanner sc=new Scanner(System.in);
       
        int M=sc.nextInt();
        int N=sc.nextInt();
        
        boolean[] flag=new boolean[N+1];
       
        flag[0]=flag[1]=true;
        for(int i=2;i<=N;i++){
            if(flag[i]==false) {//소수라면
                if(i>=M)
                    System.out.println(i);
                for(int j=i+i;j<=N;j+=i)
                    flag[j]=true;    
            }
        }
    }
}
//에라토스테네스의 체
// 소수면 체크, 소수의 배수는 모두 제외