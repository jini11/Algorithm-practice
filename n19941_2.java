import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class n19941_2 { 
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String line = br.readLine();
        int result = 0;
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] check = new boolean[n];
        for(int i =0;i<n;i++) {
            if(line.charAt(i)=='P') {
                list.add(i);
                check[i] = true;
            }
        }
        
        for(int i=0;i<list.size();i++) {
            for(int j=list.get(i)-k;j<=list.get(i)+k;j++) {
                if(j<0 || j>=n) continue;
                if(check[j] == false) {
                    check[j] = true;
                    result++;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
