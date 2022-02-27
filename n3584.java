import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n3584 {
    static int T, n, result;
    static int[] parent;
    static int node1, node2;
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++) {
            n = Integer.parseInt(br.readLine());
            parent = new int[n+1];

            for(int i=1;i<n;i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                parent[b] = a;
            }
            st = new StringTokenizer(br.readLine());
            node1 = Integer.parseInt(st.nextToken());
            node2 = Integer.parseInt(st.nextToken());

            int depth1 = get_depth(node1, 0);
            int depth2 = get_depth(node2, 0);

            result = compare_depth(node1, depth1, node2, depth2);

            System.out.println(result);
        }
    }
    public static int get_depth(int node, int depth) {
        int temp = node;
        while(temp!=0) {
            depth++;
            temp = parent[temp];
        }
        return depth-1;
    }
    public static int compare_depth(int node1, int depth1, int node2, int depth2) {
        if(depth1 > depth2) {
            while(depth1 != depth2) {
                depth1--;
                node1 = parent[node1];
            }
        } else if(depth1 < depth2) {
            while(depth1 != depth2) {
                depth2--;
                node2 = parent[node2];
            }
        }
        while(node1 != node2) {
            node1 = parent[node1];
            node2 = parent[node2];
        }
        return node1;
    }
}
