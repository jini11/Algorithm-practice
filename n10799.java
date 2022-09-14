import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class n10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();

        String input = br.readLine();
        int answer = 0; // 출력값
        for(int i=0;i<input.length()-1;i++) {
            char open = input.charAt(i);
            char close = input.charAt(i+1);
            if(open == '(' && close == '(') {
                stack.add('(');
            } 

            if(open == '(' && close == ')') {
                answer += stack.size();
                
            } 
        
            if(open == ')' && close == ')') {
                answer++;
                stack.pop();
            }
        }
        System.out.println(answer);
    }
}
