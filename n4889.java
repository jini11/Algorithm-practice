import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class n4889 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 1;
        while(true) {
            String input = br.readLine();
            if(input.contains("-")) break;

            Stack<Character> stack = new Stack<>();
            int answer = 0;
            for(int i=0;i<input.length();i++) {
                if(input.charAt(i) == '{') {
                    stack.push('{');
                } else { // '}'
                    if(stack.isEmpty()) {
                        stack.push('{');
                        answer++;
                    } else {
                        stack.pop();
                    } 
                }
            }
            System.out.println((cnt++)+". "+(answer + stack.size()/2));
        }
    }
}
