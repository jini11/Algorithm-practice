import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class n1764 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<n;i++)
            set.add(br.readLine());
        ArrayList<String> result = new ArrayList<>();
        for(int i=0;i<m;i++) {
            String line = br.readLine();
            if(set.contains(line))
                result.add(line);
        }
        Collections.sort(result);
        System.out.println(result.size());
        for(int i=0;i<result.size();i++)
            System.out.println(result.get(i));
    }
}
