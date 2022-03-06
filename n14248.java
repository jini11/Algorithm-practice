import java.util.Scanner;

public class n14248 {
    static int n, s, count;
    static int[] arr;
    static boolean[] visited;
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n+1];
        visited = new boolean[n+1];
        for(int i=1;i<=n;i++)
            arr[i] = sc.nextInt();
        s = sc.nextInt();
        count = 1;
        dfs(s);
        System.out.println(count);
    }
    public static void dfs(int start) {
        visited[start] = true;
        int[] dx = {arr[start], -arr[start]};
        for(int i=0;i<2;i++) {
            int nx = start + dx[i];
            if(nx<=0 || nx>n) continue;
            if(!visited[nx]) {
                dfs(nx);
                count++;
            }
        }
    }
}
