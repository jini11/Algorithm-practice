import java.io.*;

public class n13413 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int t=0;t<T;t++) {
            int n = Integer.parseInt(br.readLine());
            String str1 = br.readLine();
            String str2 = br.readLine();
            int w = 0;
            int b = 0;
            int result = 0;
            if(str1.length()!=n || str2.length()!=n)
                return;

            for(int i=0;i<n;i++) {
                if(str1.charAt(i) != str2.charAt(i)) { //equals보다 charAt이 더 빠르구나,,
                    if(str1.charAt(i) == 'W')
                        w++;
                    else b++;
                } 
            }
            result = Math.min(w,b) + Math.abs(w-b);
            System.out.println(result);
        }
    }
}
