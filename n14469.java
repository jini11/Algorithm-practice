import java.util.*;

public class n14469 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i=0;i<n;i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, Comparator.comparingInt(o1 -> o1[0]));

        long result = arr[0][0] + arr[0][1];
        for(int i=1;i<n;i++) {
            if(result <= arr[i][0]) // 도착시간보다 빨리 끝났다면
                result = arr[i][0] + arr[i][1];
            else
                result += arr[i][1];
        }
        System.out.println(result);
    }
}
