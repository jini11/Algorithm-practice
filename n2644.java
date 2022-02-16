import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class n2644 {
    static int[][] arr;
    static boolean[] visited;
    static int n, c1, c2;
    static int[] count;
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        c1 = sc.nextInt();
        c2 = sc.nextInt();
        int t = sc.nextInt();

        arr = new int[n+1][n+1];
        visited = new boolean[n+1];
        count = new int[n+1];
        for(int i=0;i<t;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        bfs(c1);
        if(count[c2]!=0)
            System.out.println(count[c2]);
        else System.out.println(-1);
    }
    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        if(start==c2)
            return;
        while(!queue.isEmpty()) {
            int temp = queue.poll();
            for(int i=1;i<=n;i++) {
                if(arr[temp][i] == 1 && visited[i] == false) {
                    queue.add(i);
                    visited[i] = true;
                    count[i] = count[temp]+1;
                }
            }
        }
    }
}
