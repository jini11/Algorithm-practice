import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class n11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<Long, Integer> map = new HashMap<>();
        int max = 0;
        long x = 0;
        for(int i=0;i<n;i++) {
            Long tmp = Long.parseLong(br.readLine());
            map.put(tmp, map.getOrDefault(tmp, 0)+1);
        
            if(map.get(tmp) > max) {
                max = map.get(tmp);
                x = tmp;
            } else if(map.get(tmp) == max)
                x = Math.min(x, tmp);
        }
        System.out.println(x);
    }
}
