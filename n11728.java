import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+m];
        int idx = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++)
            arr[idx++] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++)
            arr[idx++] = Integer.parseInt(st.nextToken());  
        Arrays.sort(arr);  
        for(int i=0;i<arr.length;i++)
            bw.write(arr[i]+" ");
        bw.close();
    }
}
