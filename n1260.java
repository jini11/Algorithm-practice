import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class n1260 {
    public static int[][] arr;
    public static boolean[] visited;

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int node = sc.nextInt();
        int line = sc.nextInt();
        int start = sc.nextInt();

        arr = new int[node+1][node+1]; 

        for(int i=0;i<line;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        //깊이
        visited = new boolean[node+1];
        dfs(start);
        System.out.println();
                
        //너비
        visited = new boolean[node+1];
        bfs(start);
    }

    public static void dfs(int start) {
        visited[start] = true;
        System.out.print(start+" ");
        
        if(start == arr.length)
            return;
        
        for(int i=1;i<arr.length;i++) {
            if(arr[start][i] == 1 && visited[i] == false)
                dfs(i);
        }
    }

    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);
        System.out.print(start+" ");

        while(!queue.isEmpty()) {
            int temp = queue.poll();
            for(int i=1;i<arr.length;i++) {
                if(arr[temp][i] == 1 && visited[i] == false) {
                    queue.add(i);
                    visited[i] = true;
                    System.out.print(i+" ");
                }
            }

        }
    }
}
