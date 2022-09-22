import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n1759 {
    static char[] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int l = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        arr = new char[c];
        for(int i=0;i<c;i++)
            arr[i] = st.nextToken().charAt(0);
        
        Arrays.sort(arr);

        makePassword(0, 0, sb, l);
    }
    public static void makePassword(int start, int cnt, StringBuilder sb, int n) {
        if(cnt == n) {
            if(checkPassword(sb.toString())) {
                System.out.println(sb.toString());
                return;
            }
        }

        for(int i=start;i<arr.length;i++) {
            sb.append(arr[i]);
            makePassword(i+1, cnt+1, sb, n);
            sb.delete(cnt, cnt+1);
        }
    }
    public static boolean checkPassword(String str) {
        int mo = 0, ja = 0;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'|| str.charAt(i) == 'o' || str.charAt(i) == 'u' )
                mo++;
            else ja++;
        }
        if(mo >= 1 && ja >= 2) return true;
        return false;
    }
}
