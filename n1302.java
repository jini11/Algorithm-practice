import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class n1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            String str = br.readLine();
            if(map.get(str) == null) {
                map.put(str, 1);
            }else {
                map.put(str, map.get(str) + 1);
            }
        }

        int val = 0;
        String ans = "";
        for(String key : map.keySet()) {
            if(val == map.get(key)) {
                if(ans.compareTo(key) > 0) {
                    ans = key;
                }
            }else if(val < map.get(key)) {
                val = map.get(key);
                ans = key;
            }

        }
        System.out.println(ans);
    }
}
