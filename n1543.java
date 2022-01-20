import java.io.*;

public class n1543 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
        String input = br.readLine();
        String search = br.readLine();
        int result = 0;

        input = input.replaceAll(search,"_");

        for(int i=0;i<input.length();i++) {
            if(input.charAt(i)=='_')
                result++;
        }

        System.out.println(result);
    }
}
