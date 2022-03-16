import java.util.Scanner;

public class n11727 {
    static int[] arr = new int[1001];
    static int tile;
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        tile = sc.nextInt();
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 3;
        for(int i=3;i<=tile;i++)
            arr[i] = (arr[i-1] + 2 * arr[i-2]) % 10007;
        System.out.println(arr[tile]);
    }
    
}

//1x2, 2x1, 2x2 -> 3가지
// n=1 일 때 1가지
// n=2 일 때 3가지
// n=3 일 때 5가지
// n=4 일 때 11가지
// => f(n-1) + 2 * f(n-2)  
