import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[8];
        for(int i=0;i<8;i++)
            arr[i] = Integer.parseInt(st.nextToken());
        
        String answer = "";
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i] == arr[i+1]-1)
                answer = "ascending";
            else if(arr[i] == arr[i+1]+1)
                answer = "descending";
            else {
                answer = "mixed";
                break;
            }
        }
        System.out.println(answer);
    }
}
