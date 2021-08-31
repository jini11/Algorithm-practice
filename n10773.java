import java.util.*;

public class n10773 {
    public static void main(String[] args) throws Exception {

        Scanner sc=new Scanner(System.in);
        Stack<Integer> stack=new Stack<>();
        int result=0;
        int n= sc.nextInt();

        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            if(num==0){
                stack.pop();
            } else {
                stack.push(num);
            }
        }

        for(int o :stack)
            result+=o;

        System.out.println(result);
    }
}
