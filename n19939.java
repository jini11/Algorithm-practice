import java.io.*;

public class n19939 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = Integer.parseInt(str.split(" ")[0]);
        int k = Integer.parseInt(str.split(" ")[1]);
        int sum = 0;

        for(int i=1;i<=k;i++) 
            sum += i;
        
        n = n - sum;

        if(n<0)
            System.out.println(-1);
        else {
            if(n%k==0)
                System.out.println(k-1);
            else 
                System.out.println(k);
        }
    }
}
