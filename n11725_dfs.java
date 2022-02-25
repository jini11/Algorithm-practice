import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class n11725_dfs { // 다시 풀어볼 것
    static int n;
    static ArrayList<Integer>[] list;
    static int[] parent;
    static boolean[] visited;
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        list = new ArrayList[n+1];
        visited = new boolean[n+1];
        parent = new int[n+1];
        for(int i=1;i<=n;i++)
            list[i] = new ArrayList<>();

        for(int i=0;i<n-1;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }
        dfs(1);
        for(int i=2;i<=n;i++) 
            System.out.println(parent[i]);
    }
    public static void dfs(int start) {
        visited[start] = true;

        for(int i=0;i<list[start].size();i++) {
            int temp = list[start].get(i);
            if(visited[temp] == false) {
                parent[temp] = start;
                dfs(temp);
            }
        }
    }
}
