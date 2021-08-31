import java.util.*;

public class n17298 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();

        int num = sc.nextInt();


        int[] arr = new int[num];

        for(int i=0;i<num;i++)
            arr[i]=sc.nextInt();

        stack.push(-1);
      
        int check = arr[num-1];
        for(int i=num-2;i>=0;i--){
            if(arr[i]<arr[i+1])
            if(arr[i]<check)
                stack.push(check);
            else {
                check = arr[i];
                stack.push(-1);
            }
        }
        
        for(int i=0;i<num;i++)
            System.out.print(stack.pop()+" ");

    }

    
}
// 4 1 5 7
// 5 5 7 -1

// 4 1 3 5 7
// 5 5 5 7 -1