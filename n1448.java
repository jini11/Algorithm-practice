import java.io.*;
import java.util.Arrays;

public class n1448 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n]; // Int형으로 선언하면 메모리 초과 발생
        long result = 0;
        for(int i=0;i<n;i++)
            arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        for(int i=n-1;i>1;i--) {
            if(arr[i-2] + arr[i-1] > arr[i]) {
                result = Math.max(result, arr[i]+arr[i-1]+arr[i-2]);
                break;
            } else result = -1;
        }
        System.out.println(result);
    }
}
