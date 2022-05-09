import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class n14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s.split(" ")[0]);
        int m = Integer.parseInt(s.split(" ")[1]);
        HashMap<String, Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0;i<n;i++)
            map.put(br.readLine(), 1);
        for(int i=0;i<m;i++) {
            String str = br.readLine();
            if(map.get(str) != null) count++;
        }
        System.out.println(count);
    }
}
