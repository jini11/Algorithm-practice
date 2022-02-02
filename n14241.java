import java.util.*;

public class n14241 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int result = 0;
        for(int i=0;i<n;i++)
            list.add(sc.nextInt());
        
        while(true) {
            if(list.size()==1)
                break;
            Collections.sort(list);
            int a = list.get(list.size()-1);
            int b = list.get(list.size()-2);
            result += a * b;
            list.remove(list.size()-1);
            list.remove(list.size()-1);
            list.add(a+b);
        }
        System.out.println(result);
    }
}
