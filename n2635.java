import java.util.ArrayList;
import java.util.Scanner;

public class n2635 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = 0;
        ArrayList<Integer> result = new ArrayList<>();

        for (int i=N; i>=N/2; i--) {
            ArrayList<Integer> list = new ArrayList<>();

            int first = N;
            int second = i;

            list.add(first);
            list.add(second);

            while(true) {
                if (first < 0) break;

                int tmp = first - second;
                if (tmp >= 0) {
                    list.add(tmp);
                } else break;
                
                first = second;
                second = tmp;
            }
            if (max < list.size()) {
                max = list.size();
                result = list;
            }
        }

        System.out.println(max);
        for (int i=0; i<result.size(); i++)
            System.out.print(result.get(i) + " ");
    }
}
