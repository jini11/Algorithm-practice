import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n3028 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] arr = {1, 0, 0};

        for(int i=0;i<s.length();i++) {
            char input = s.charAt(i);
            if(input == 'A') {
                int temp = arr[0];
                arr[0] = arr[1];
                arr[1] = temp;
            } else if(input == 'B') {
                int temp = arr[1];
                arr[1] = arr[2];
                arr[2] = temp;
            } else if(input == 'C') {
                int temp = arr[0];
                arr[0] = arr[2];
                arr[2] = temp;
            }
        }
        for(int i=0;i<3;i++) {
            if(arr[i] == 1)
                System.out.println(i+1);
        }
    }
}