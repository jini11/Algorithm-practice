import java.util.Scanner;

public class n14720 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        
        int idx = 0;
        int answer = 0;
        for(int i=0;i<n;i++) {
            if(arr[i] == idx) {
                answer++;
                idx++;
            }
            if(idx > 2) idx = 0;
        }
        System.out.println(answer);   
    }
}
