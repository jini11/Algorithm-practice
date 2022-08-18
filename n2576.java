import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class n2576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int i=0;i<7;i++) {
            int n = sc.nextInt();
            if(n%2==1) {
                sum += n;
                list.add(n);
            }
        }
        Collections.sort(list);
        if(list.size() > 0) {
            System.out.println(sum);
            System.out.println(list.get(0));
        } else
            System.out.println(-1);
    }
}
