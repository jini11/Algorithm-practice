import java.util.HashSet;
import java.util.Scanner;

public class n11478 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<s.length();i++) {
            String tmp = "";
            for(int j=i;j<s.length();j++) {
                tmp += s.substring(j, j+1);
                set.add(tmp);
            }
        }
        System.out.println(set.size());
    }
}
