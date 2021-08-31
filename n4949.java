import java.util.*;


public class n4949 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(true){
            String s= sc.nextLine();

            if(s.equals("."))
                break;

            System.out.println(yesorno(s));
        }
        
    }

    /*
    public static String yesorno(String s){
        Stack<String> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            String alpha = s.split("")[i];

            if(alpha.equals("(") || alpha.equals("["))
                stack.push(alpha);
            else if(alpha.equals(")")){
                if(stack.size()==0 || stack.peek().equals("["))
                    return "no";
                else
                    stack.pop();
            }
            else if(alpha.equals("]")){
                if(stack.size()==0 || stack.peek().equals("("))
                    return "no";
                else
                    stack.pop();
            }
        }

        if(stack.size()==0)
            return "yes";
        else
            return "no";
    }
    */

    public static String yesorno(String s){
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            char alpha = s.charAt(i);

            if(alpha=='(' || alpha=='[')
                stack.push(alpha);
            else if(alpha==')'){
                if(stack.size()==0 || stack.peek()=='[')
                    return "no";
                else
                    stack.pop();
            }
            else if(alpha==']'){
                if(stack.size()==0 || stack.peek()=='(')
                    return "no";
                else
                    stack.pop();
            }
        }

        if(stack.size()==0)
            return "yes";
        else
            return "no";
    }
}

// char이 아니라 String 으로 하면 메모리 초과 발생



// 큐 사용

//문자열 처음부터 하나씩 확인하면서 괄호 있으면 큐에 넣기, 닫는 괄호가 나오면 큐에서 빼기
//1. (, [ 이 아니라 ), ] 먼저 틀어오면 무조건 no
//2. (, [ 인 상태에서는 무조건 ]가 와야함
//3. 
// 마지막까지 큐가 비어있으면 yes