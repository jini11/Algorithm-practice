import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class n1389 {
    static int[][] arr;
    static boolean[] visited;
    static int n, m, count;
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n+1][n+1];
        visited = new boolean[n+1];
        ArrayList<Integer> list = new ArrayList<>();
        int[] result = new int[n+1];

        for(int i=0;i<n;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        for(int i=1;i<=n;i++) {
            count = 0;
            bfs(i);
            result[i] = count;
        }

    }
    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        
    }
}
