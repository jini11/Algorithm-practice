import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class n11724_bfs {
    static int[][] arr;
    static boolean[] visited;
    static int n, m, count;
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n+1][n+1];
        visited = new boolean[n+1];
        count = 0;

        for(int i=0;i<m;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        for(int i=1;i<=n;i++) {
            if(visited[i] == false) {
                bfs(i);
                count++;
            }
        }
        System.out.println(count);
    }
    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);

        while(!queue.isEmpty()) {
            int temp = queue.poll();
            for(int i=1;i<=n;i++) {
                if(arr[temp][i]==1 && visited[i]==false) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
