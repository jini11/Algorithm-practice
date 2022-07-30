import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class n3986 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack;
        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        for(int t=0;t<n;t++) {
            stack = new Stack<>();
            String s = br.readLine();
            for(int i=0;i<s.length();i++) {
                char c = s.charAt(i);
                if(stack.isEmpty()) {
                    stack.push(c);
                } else {
                    if(stack.peek() == c) {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                }
            }
            if(stack.size() == 0) answer++;
        }
        System.out.println(answer);
    }
}
