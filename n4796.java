import java.io.*;
import java.util.Arrays;

public class n4796 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = 1;
        while(true) {
            String str = br.readLine();
            int result = 0;
            if(str.equals("0 0 0"))
                break;
            
            String[] arr = str.split(" ");

            int[] lpv = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();

            result = (lpv[2] / lpv[1]) * lpv[0];
            if(lpv[2] % lpv[1] <= lpv[0])
                result += lpv[2] % lpv[1];
            else
                result += lpv[0];
                
            System.out.println("Case "+i+": "+result);
            i++;
        }
    }
}
