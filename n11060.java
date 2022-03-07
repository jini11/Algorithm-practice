import java.util.Scanner;

public class n11060 {
    static int[] arr;
    static int[] visited;
    static int n, count;
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        visited = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
            visited[i] = -1;
        }
        visited[0] = 0;
        for(int i=0;i<n-1;i++) {
            if(visited[i] == -1) continue;
            for(int j=1;j<=arr[i];j++) {
                if(i+j<n) {
                    if(visited[i+j] == -1 || visited[i+j] > visited[i] + 1)
                        visited[i+j] = visited[i] + 1;
                }
            }
        }
        System.out.println(visited[n-1]);
    }
}
