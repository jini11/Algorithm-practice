import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n1920 {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++) {
            int key = Integer.parseInt(st.nextToken());
            if(binarySearch(key) >= 0)
                bw.write(1+"\n");
            else
                bw.write(0+"\n");
        }
        bw.flush();
    } 

    public static int binarySearch(int key) {
        int left = 0;
        int right = arr.length-1;

        while(left<=right) {
            int mid = (left + right) / 2;
            if(arr[mid] == key) return mid;
            else if(arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
        return -1;
    }
}
