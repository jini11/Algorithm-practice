import java.util.Scanner;

public class n3040 {
    static int[] arr = new int[9];
    static int[] answer = new int[7];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<9; i++) {
            arr[i] = sc.nextInt();
        }

        combi(0, 0);

    }
    public static void combi(int depth, int cnt) {
        if (cnt == 7) {
            int sum = 0;
            for (int i=0; i<7; i++) {
                sum += answer[i];
            }
            if (sum == 100) {
                for (int i=0; i<7; i++) {
                    System.out.println(answer[i]);
                }
            }
            return;
        }

        for (int i=depth; i<9; i++) {
            answer[cnt] = arr[i];
            combi(i+1, cnt+1);
        }
    }
}
