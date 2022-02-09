import java.util.Scanner;

public class n2606_dfs {
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
        dfs(1);
        System.out.println(count-1);
    }

    public static void dfs(int start) {
        visited[start] = true;
        count++;

        if(start==arr.length)
            return;
        
        for(int i=1;i<arr.length;i++) {
            if(arr[start][i] == 1 && visited[i] == false)
                dfs(i);
        }
    }
}
