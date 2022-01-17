import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class n1049 {
    public static void main(String []args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] one = new int[m];
        int[] pack = new int[m];
        int[] result = new int[3];

        for(int i=0;i<m;i++) {
            pack[i] = sc.nextInt();
            one[i] = sc.nextInt();
        }

        Arrays.sort(one);
        Arrays.sort(pack);

        result[0] = n * one[0];
        result[1] = (n / 6 * pack[0]) + (n % 6 * one[0]);
        result[2] = (n / 6 + 1) * pack[0];

        System.out.println(Math.min(result[0], Math.min(result[1], result[2])));
    }
}
