import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class n4963_bfs {
    static int[][] arr;
    static boolean[][] visited;
    static int w, h;
    static int result;
    static int[] dx = {0, 0, 1, -1, -1, 1, -1, 1};
    static int[] dy = {1, -1, 0, 0, 1, 1, -1, -1};
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            result = 0;
            w = sc.nextInt();
            h = sc.nextInt();
            if(w==0 && h==0)
                break;
            
            arr = new int[h+1][w+1];
            visited = new boolean[h+1][w+1];

            for(int i=0;i<h;i++) {
                for(int j=0;j<w;j++) {
                    arr[i+1][j+1] = sc.nextInt();
                }
            }

            for(int i=1;i<=h;i++) {
                for(int j=1;j<=w;j++) {
                    if(arr[i][j]==1 && visited[i][j]==false) {
                        result++;
                        bfs(i, j);
                    }
                }
            }
            System.out.println(result);
        }
    }

    public static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();

        
    }
}
