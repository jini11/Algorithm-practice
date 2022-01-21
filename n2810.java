import java.io.*;

public class n2810 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        if(str.contains("LL")) {
            str = str.replaceAll("LL","L");
            System.out.println(str.length()+1);
        } else {
            System.out.println(str.length());
        }
    }
}
