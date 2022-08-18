import java.util.Scanner;

public class n2960 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0;
        boolean[] num = new boolean[n+1];

        for(int i=2;i<=n;i++)
            num[i] = true;

        for(int i=2;i<=n;i++) {
            for(int j=i;j<=n;j+=i) {
                if(!num[j]) continue;
                num[j] = false;
                cnt++;
                if(cnt == k) {
                    System.out.println(j);
                    System.exit(0);
                }
            }
        }
    }
}
