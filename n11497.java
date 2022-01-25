import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class n11497 {
    public static void main(String []args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); 
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr); 
            int left = N - 1;
            int right = 0;
            int[] nums = new int[N];
            
            for (int i = 0; i < N; i++) {
                if (i % 2 == 0) {
                    nums[left--] = arr[i];
                } else {
                    nums[right++] = arr[i];
                }
            }
            
            int answer = Math.abs(nums[0]-nums[N-1]);
            for (int i = 1; i < N; i++) {
                answer = Math.max(answer, Math.abs(nums[i] - nums[i - 1]));
            }
            
            System.out.println(answer);
        }
    }
}
