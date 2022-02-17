import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n12782 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++) {
            String line = br.readLine();
            String n = line.split(" ")[0];
            String m = line.split(" ")[1];

            int one = 0;
            int zero = 0;
            int count = 0;
            for(int i=0;i<n.length();i++) {
                if(n.charAt(i)!=m.charAt(i)) {
                    if(n.charAt(i) == '0')
                        zero++;
                    else
                        one++;
                }
            }

            while(true) {
                if(zero==0 || one==0)
                    break;
                zero--;
                one--;
                count++;
            }
            if(zero==0 && one==0)
                System.out.println(count);
            else
                System.out.println(count+zero+one);
        }
    }
}
