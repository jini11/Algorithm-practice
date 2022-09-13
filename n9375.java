import java.util.HashMap;
import java.util.Scanner;

public class n9375 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int n=sc.nextInt();
            HashMap<String, Integer> closet = new HashMap<>();
            int count=1;

            for(int j=0;j<n;j++){
                String name = sc.next();
                String type = sc.next();
                closet.put(type, closet.getOrDefault(type, 0) + 1);
            }
            
            for(int value : closet.values()) {
                count *= (value + 1);
            }
            System.out.println(count-1);
        }
    }
}
