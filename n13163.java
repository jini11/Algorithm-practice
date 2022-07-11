import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n13163 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int t=0;t<n;t++) {
            String s = br.readLine();
            String[] arr = s.split(" ");
            String answer = "god";
            for(int i=1;i<arr.length;i++) {
                answer += arr[i];
            }
            System.out.println(answer);
        }
    }
}
