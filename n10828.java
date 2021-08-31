import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class n10828 {
    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String r = br.readLine();
        int n = Integer.parseInt(r);

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String[] sarr = new String[2];
            String result="";

            if (s.split(" ")[0].equals("push")) {
                sarr[0] = s.split(" ")[0];
                sarr[1] = s.split(" ")[1];
                push(sarr[0],sarr[1]);
            } else {
                result=calc(s);
                System.out.println(result);
            }
        }
    }

    public static void push(String co, String num) {
        stack.push(Integer.parseInt(num));
    }

    public static String calc(String co) {
        String result = "";

        if(co.equals("empty")){
            if(stack.size()==0)
                result="1";
            else
                result="0";
        } else if(co.equals("pop")){
            if(stack.size()==0)
                result="-1";
            else
                result=Integer.toString(stack.pop());
        } else if(co.equals("size")){
            result=Integer.toString(stack.size());
        } else if(co.equals("top")){
            if(stack.size()==0)
                result="-1";
            else
                result=Integer.toString(stack.peek());
        }

        return result;
    }
}

// 입력 받아 " " 단위로 쪼개서 배열에 넣기
// 0번째 값이 push, top, size, pop, empty.. 면 switch문 or if문
