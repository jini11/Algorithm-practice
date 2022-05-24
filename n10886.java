import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class n10886 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt1 = 0;
        int cnt0 = 0;
        for(int i=0;i<n;i++) {
            int temp = sc.nextInt();
            if(temp == 0) cnt0++;
            else cnt1++;
        }
        if(cnt1 >= cnt0)
            System.out.println("Junhee is cute!");
        else
            System.out.println("Junhee is not cute!");
    }
}
