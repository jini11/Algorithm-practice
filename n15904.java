import java.io.*;

public class n15904 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] ucpc = {'U', 'C', 'P', 'C'};
        String str = br.readLine();
        int k = 0;
        for(int i=0;i<str.length();i++) {
            if(k==4)
                break;
            if(str.charAt(i) == ucpc[k])
                k++;
        }
        if(k >= 4)
            System.out.println("I love UCPC");
        else
            System.out.println("I hate UCPC");
    }
}
