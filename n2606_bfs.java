import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class n2606_bfs {
    public static int[][] arr;
    public static boolean[] visited;
    public static int count = 0;
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int com = sc.nextInt();
        int line = sc.nextInt();

        arr = new int[com+1][com+1];

        for(int i=0;i<line;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        //깊이
        visited = new boolean[com+1];
        bfs(1);
        System.out.println(count-1);
    }

    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        visited[start] = true;
        count++;

        while(!queue.isEmpty()) {
            int temp = queue.poll();
            for(int i=1;i<arr.length;i++) {
                if(arr[temp][i] == 1 && visited[i] == false) {
                    queue.add(i);
                    visited[i] = true;
                    count++;
                }
            }
        }
    }
}
