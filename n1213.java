import java.io.*;

public class n1213 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int[] alpha = new int[26];
        int count = 0;
        int center = 0;
        String result = "";
        for(int i=0;i<input.length();i++) {
            alpha[input.charAt(i) - 'A']++;
        }
        
        for(int i=0;i<alpha.length;i++) {
            if(alpha[i]%2!=0) {
                count++;
                center = i;
            }
            if(count > 1) {
                System.out.println("I'm Sorry Hansoo");
                return;
            }
        }

        for(int i=0;i<alpha.length;i++) {
            for(int j=0;j<alpha[i] / 2;j++) {
                result += (char)(i+'A');
            }
        }
        
        String re = "";
        for(int i=result.length()-1;i>=0;i--) 
            re += result.charAt(i);

        if(count == 1) {
            result += (char)(center+'A');
        }

        result += re;
        System.out.println(result);
    }
}
