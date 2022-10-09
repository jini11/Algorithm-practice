import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class n9093 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));        
        int t = Integer.parseInt(br.readLine());         
        
        while (t-- > 0) {            
            Stack<Character> stack = new Stack<>();            
            String str = br.readLine() +"\n";            
            for (char ch : str.toCharArray()) {                
                if (ch == ' ' || ch == '\n') {                    
                    while (!stack.isEmpty()) {                        
                        bw.write(stack.pop());                    
                    }                    
                    bw.write(ch);                
                }                
                else stack.push(ch);            
            }        
        }        
        bw.flush();    
    }

}
