import java.io.*;

public class n1439 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String[] arr = new String[str.length()];
        arr = str.split("");

        int zero = 0;
        int one = 0;
        if(arr[0].equals("0"))
            zero++;
        else
            one++;
            
        for(int i=1;i<arr.length;i++) {
            if(arr[i].equals("0") && !arr[i].equals(arr[i-1]))
                zero++;
            else if(arr[i].equals("1") && !arr[i].equals(arr[i-1]))
                one++;
        }
        
        System.out.println(Math.min(zero,one));
    }
}
