import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class n11899 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Stack<Character> stack = new Stack<>();

        stack.push(s.charAt(0));

        for(int i=1;i<s.length();i++) {
            char c = s.charAt(i);
            if(c == '(')
                stack.push(c);
            else {
                if(!stack.isEmpty() && stack.peek() == '(')
                    stack.pop();
                else
                    stack.push(c);
            }
        }
        
        System.out.println(stack.size());

    }
}
