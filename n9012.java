import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class n9012 {
    static Stack<Character> stack = new Stack<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String result = "";
            String s = "";
            s=br.readLine();
            
            result = compa(s);
        
            System.out.println(result);
        }
    }

    public static String compa(String s) {
        String[] arr = new String[s.length()];
        char a;
        int cnt=0;
        for (int j = 0; j < arr.length; j++) {

            a = s.charAt(j);

            if (a=='(')
                cnt++;
            else  {
                cnt--;
            } 
            
            if(cnt<0){
               return "NO";
            }
        }
        if (cnt==0)
            return "YES";
        else
            return "NO";
    }
}
