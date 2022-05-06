import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class n18870 {
    public static void main(String []args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] copy = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++)
            arr[i] = copy[i] = Integer.parseInt(st.nextToken());
        
        Arrays.sort(copy);
        for(int i=0;i<n;i++) {
            if(!map.containsKey(copy[i])) {
                map.put(copy[i], cnt++);
            }
        }
        for(int i=0;i<n;i++)
            sb.append(map.get(arr[i])).append(" ");
        System.out.println(sb);
    }
}
