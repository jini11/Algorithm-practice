import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class n1935 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        double[] arr = new double[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }

        Stack<Double> stack = new Stack<>();

        double result = 0;
        for(int i = 0; i < s.length(); i++) {
            if('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
                stack.push(arr[s.charAt(i) - 'A']);
            } else {
                if(!stack.isEmpty()) {
                    double first = stack.pop();
                    double second = stack.pop();
                    switch (s.charAt(i)) {
                        case '+':
                            result = second + first;
                            stack.push(result);
                            continue;
                        case '-':
                            result = second - first;
                            stack.push(result);
                            continue;
                        case '*':
                            result = second * first;
                            stack.push(result);
                            continue;
                        case '/':
                            result = second / first;
                            stack.push(result);
                            continue;
                    }
                }
            }
        }

        System.out.printf("%.2f", stack.pop());
    }
}
