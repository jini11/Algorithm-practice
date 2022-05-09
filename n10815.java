import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n10815 {
    static int n, m;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++) {
            int num = Integer.parseInt(st.nextToken());
            if(check(num)) System.out.print("1 ");
            else System.out.print("0 ");
        }
    }
    public static boolean check(int num) {
        int start = 0;
        int end = n-1;
        while(start<=end) {
            int mididx = (start + end) / 2;
            int mid = arr[mididx];
            if(num<mid) end = mididx - 1;
            else if(num>mid) start = mididx + 1;
            else return true;
        }
        return false;
    }
}
