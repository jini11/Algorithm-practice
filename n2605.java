import java.util.ArrayList;
import java.util.Scanner;

public class n2605 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i=0; i<N; i++)
            arr[i] = sc.nextInt();

        list.add(1);
        for (int i=1; i<N; i++) {
            list.add(i-arr[i], i+1);
        }

        for (int i=0; i<N; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
