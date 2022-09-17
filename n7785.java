import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class n7785 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++) {
            String s = br.readLine();
            String[] record = s.split(" ");
            
            if(record[1].equals("enter")) {
                map.put(record[0], map.getOrDefault(record[0], 0));
            } else {
                map.remove(record[0]);
            }
        }
        ArrayList<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list, Collections.reverseOrder());

        for(String value : list) {
            System.out.println(value);
        }
    }
}
