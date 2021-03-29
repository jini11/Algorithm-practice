import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class n2981 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
       
        int min = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        min = arr[0];
        int[] num = new int[min];
        for (int i = 2; i < min; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[j] % i == arr[k] % i) {
                        num[i]++;
                    }
                }
            }
            if (num[i] < N - 1)
                num[i] = 0;

            if (num[i] != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
