import java.util.Scanner;

public class n17521 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long w = sc.nextLong();
        int[] s = new int[n];
        long coin = 0;
        for(int i=0;i<n;i++)
            s[i] = sc.nextInt();
      
        for(int i=0;i<n-1;i++) {
            if(s[i]>s[i+1]) { //sell
                w += coin*s[i];
                coin = 0;
            } else if(coin==0 && s[i]<s[i+1])  {  //buy
                coin = w/s[i];
                w = w%s[i];
            }
        }
        w += coin*s[s.length-1];
        System.out.println(w);
    }
}
