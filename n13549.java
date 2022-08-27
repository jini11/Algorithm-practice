import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class n13549 {
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
            if(idx*2 <= 100000 && visited[idx*2] == 0) { // 여기가 포인트! 시간이 증가하지 않아야 하므로 제일 먼저 계산
                visited[idx*2] += visited[idx];
                queue.add(idx*2);
            }
            if(idx-1 >= 0 && visited[idx-1] == 0) {
                visited[idx-1] += visited[idx] + 1;
                queue.add(idx-1);
            }
            if(idx+1 <= 100000 && visited[idx+1] == 0) {
                visited[idx+1] += visited[idx] + 1;
                queue.add(idx+1);
            }
        }
        return 0;
    }
}
