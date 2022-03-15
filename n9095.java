import java.util.Scanner;

public class n9095 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = new int[11];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;

        for(int t=0;t<T;t++) {
            int n = sc.nextInt();
            for(int i=4;i<=n;i++)
                arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
            System.out.println(arr[n]);
        }
    }
}
//arr[1] = 1가지
//arr[2] = 2가지(1+1, 2)
//arr[3] = 4가지(1+1+1, 1+2, 2+1, 3)

//arr[4]일 때
//1+3 -> 4가지
//2+2 -> 2가지
//3+1 -> 1가지
// 총 7가지

//arr[5]일 때
//1+4 -> 7가지
//2+3 -> 4가지
//3+2 -> 2가지
// 총 13가지