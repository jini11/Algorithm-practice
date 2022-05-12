import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n10813 {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s.split(" ")[0]);
        int m = Integer.parseInt(s.split(" ")[1]);
        int[] ball = new int[n];
        for(int i=0;i<n;i++)
            ball[i] = i+1;
        for(int i=0;i<m;i++) {
            String input = br.readLine();
            int a = Integer.parseInt(input.split(" ")[0]);
            int b = Integer.parseInt(input.split(" ")[1]);
            int temp = ball[a-1];
            ball[a-1] = ball[b-1];
            ball[b-1] = temp;
        }
        for(int i=0;i<n;i++)
            System.out.print(ball[i]+" ");
    }
}
