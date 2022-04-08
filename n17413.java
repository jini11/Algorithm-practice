import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class n17413 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Stack<Character> stack = new Stack<>();
        String result = "";
        boolean flag = false;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '<') {
                while(!stack.isEmpty())
                    result += stack.pop();
                flag = true;
            }
            else if(s.charAt(i) == '>') {
                flag = false;
                result += s.charAt(i);
                continue;
            }
            if(flag) {
                result += s.charAt(i);
            }
            else if(!flag) {
                if(s.charAt(i) == ' ') {
                    while(!stack.isEmpty()) 
                        result += stack.pop();
                    result += " ";
                    continue;
                } else {
                    stack.push(s.charAt(i));
                }
            }
            if(i == s.length()-1) {
                while(!stack.isEmpty())
                    result += stack.pop();
            }
        }
        System.out.println(result);
    }
}
