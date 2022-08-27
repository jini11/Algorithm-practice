import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class n1697 {
    static int n, k;
    static int[] visited = new int[100001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        int result = bfs(n);
        System.out.println(result);
    }

    public static int bfs(int x) {
        Queue<Integer> queue = new LinkedList<>();
        visited[x] = 1;
        queue.add(x);
        while(!queue.isEmpty()) {
            int idx = queue.poll();
            if(idx == k) {
                return visited[idx]-1;
            }
            if(idx-1>=0 && visited[idx-1] == 0) {
                visited[idx-1] = visited[idx] + 1;
                queue.add(idx-1);
            }
            if(idx+1<=100000 && visited[idx+1] == 0) {
                visited[idx+1] = visited[idx] + 1;
                queue.add(idx+1);
            }
            if(idx*2<=100000 && visited[idx*2] == 0) {
                visited[idx*2] = visited[idx] + 1;
                queue.add(idx*2);
            }
        }
        return 0;
    }
}
