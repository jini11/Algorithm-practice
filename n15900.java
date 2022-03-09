import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class n15900 { // 다시 풀어볼 것
    static LinkedList<Integer>[] list;
    static int answer = 0; 
    static int n;
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        list = new LinkedList[n+1];
        for(int i=1;i<=n;i++)
            list[i] = new LinkedList<Integer>();
        for(int i=0;i<n-1;i++) {
            String input = br.readLine();
            int a = Integer.parseInt(input.split(" ")[0]);
            int b = Integer.parseInt(input.split(" ")[1]);
            list[a].add(b);
            list[b].add(a);
        }
        dfs(1, 0, 0);
        if(answer%2==0)
            System.out.println("No");
        else
            System.out.println("Yes");
    }
    public static void dfs(int node, int depth, int cnt) {
        for(int i:list[node]) {
            if(i != depth) {
                dfs(i, node, cnt+1);
            }
        }
        if(list[node].size() == 1)
            answer += cnt;
    }
}
