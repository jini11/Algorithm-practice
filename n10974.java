import java.util.Scanner;

public class n10974 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean[] visited = new boolean[N];
        int[] num = new int[N];

        StringBuilder sb = new StringBuilder();

        dfs(0, N, visited, num);

    }
    public static void dfs(int depth, int N, boolean[] visited, int[] num) {
        if (depth == N) {
            for(int i=0;i<N;i++)
                System.out.print(num[i] + " ");
            System.out.println();
            return;
        }

        for (int i=0; i<N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                num[depth] = i+1;
                System.out.println("before");
                dfs(depth+1, N, visited, num);
                System.out.println("after: " + i);
                visited[i] = false;
            }
        }
    }
}
