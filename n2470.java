import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n2470 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++)
            arr[i] = Integer.parseInt(st.nextToken());
            
        Arrays.sort(arr); // -99 -2 -1 4 98

        int left = 0;
        int right = n-1;
        int max = Integer.MAX_VALUE;
        int a = 0;
        int b = 0;
        while(left < right) {
            int sum = arr[left] + arr[right];
            if(Math.abs(sum) < max) {
                max = Math.abs(sum);
                a = arr[left];
                b = arr[right];
            }
            if(sum>0)
                right--;
            else
                left++;
            
        }
        System.out.println(a+" "+b);
    }
}
