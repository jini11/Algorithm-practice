import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class n10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) {
            int num = Integer.parseInt(st.nextToken());
            if(map.get(num) == null) map.put(num, 1);
            else map.put(num, map.get(num)+1);
        }
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++) {
            int num = Integer.parseInt(st.nextToken());
            if(map.get(num) == null) System.out.print("0 ");
            else System.out.print(map.get(num)+" ");
        }
    }
}
