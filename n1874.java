import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;

public class n1874 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<String> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int idx = 0;
        int cnt = 1;

        for(int i=0;i<n;i++) {
            int tmp = sc.nextInt();
            if(cnt <= tmp) {
                for(int j=cnt;j<=tmp;j++) {
                    stack.push(cnt++);
                    list.add("+");
                }
            }
            if(tmp != stack.peek()) {
                System.out.println("NO");
                return;
            }
            for(int j=0;j<stack.size();j++) {
                if(tmp <= stack.peek()) {
                    stack.pop();
                    list.add("-");
                } else break;
            }
        }

        for(int i=0;i<list.size();i++)
            System.out.println(list.get(i));
    }
}
