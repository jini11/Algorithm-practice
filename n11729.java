import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n11729 {
    public static StringBuilder sb=new StringBuilder();
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());

        sb.append((int)(Math.pow(2,n)-1)).append("\n");

        hanoi(n,1,2,3);
        System.out.println(sb);
    }
    public static void hanoi(int n,int a,int b,int c){
        if(n==1){
            sb.append(a+" "+c+"\n");
            return;
        }
        hanoi(n-1,a,c,b);

        sb.append(a+" "+c+"\n");

        hanoi(n-1,b,a,c);
    }
}
