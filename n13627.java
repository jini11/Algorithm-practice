import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class n13627 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];
        int[] result = new int[n-r];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<r;i++) {
            arr[Integer.parseInt(st.nextToken())] = 1;
        }
        int k =0;
        for(int i=1;i<=n;i++) {
            if(arr[i] == 0) result[k++] = i;
        }
        if(result.length == 0) System.out.println("*");
        else {
            for(int i=0;i<result.length;i++)
                System.out.print(result[i]+" ");
        }
    }
}
