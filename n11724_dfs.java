import java.util.Scanner;

public class n11724_dfs {
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
                dfs(i);
                count++;
            }
        }
        System.out.println(count);
    }
    public static void dfs(int start) {
        visited[start] = true;
        for(int i=1;i<=n;i++) {
            if(arr[start][i]==1 && visited[i]==false) 
                dfs(i);
        }
    }
}
