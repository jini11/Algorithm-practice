import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class n9935 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        String str = br.readLine();
        String word = br.readLine();

        for(int i=0;i<str.length();i++) {
            stack.push(str.charAt(i));

            if(stack.size() >= word.length()) {
                boolean chk = true;
                for(int j=0;j<word.length();j++) {
                    if(stack.get(stack.size() - word.length() + j) != word.charAt(j)) {
                        chk = false;
                        break;
                    }
                }
                if(chk) {
                    for(int j=0;j<word.length();j++)
                        stack.pop();
                }
            }
        }
        
        for(char c : stack) {
            sb.append(c);
        }
        if(stack.size() == 0)
            System.out.println("FRULA");
        else
            System.out.println(sb.toString());
    }
}
