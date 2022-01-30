import java.io.*;

public class n13417 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++) {
            int n = Integer.parseInt(br.readLine());
            String result = "";
            String str = br.readLine();
            str = str.replaceAll(" ","");
            result += str.charAt(0);
            for(int i=1;i<str.length();i++) {
                if(str.charAt(i) <= result.charAt(0))
                    result = str.charAt(i) + result;
                else
                    result = result + str.charAt(i);
            }    
            
            System.out.println(result);
        }
    }
}
