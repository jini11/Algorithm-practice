import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class n2504 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        int result = 0;
        int value = 1;
        String input = br.readLine();

        for(int i=0;i<input.length();i++) {
            char c = input.charAt(i);
            if(c == '(') {
                stack.push('(');
                value *= 2; 
            } else if(c == '[') {
                stack.push('[');
                value *= 3;
            } else if(c == ')') {
                if(stack.isEmpty() || stack.peek() != '(') {
                    result = 0;
                    break;
                } else if(input.charAt(i-1) == '(') {
                    result += value;
                }
                stack.pop();
                value /= 2;
            } else if(c == ']') {
                if(stack.isEmpty() || stack.peek() != '[') {
                    result = 0;
                    break;
                } else if(input.charAt(i-1) == '[') {
                    result += value;
                }
                stack.pop();
                value /= 3;
            }
        }
        if(stack.isEmpty()) {
            System.out.println(result);
        } else {
            System.out.println(0);
        }
    }
}
