import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node implements Comparable<Node> {

    private int index;
    private int distance;

    public Node(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    public int getIndex() {
        return this.index;
    }

    public int getDistance() {
        return this.distance;
    }

    @Override
    public int compareTo(Node o) {
        if(this.distance < o.distance)
            return -1;
        return 1;
    }


}

public class n1753 {
    static final int INF = (int) 1e9;
    static int V, E, startNode;
    static ArrayList<ArrayList<Node>> graph = new ArrayList<>();
    static int[] d = new int[20001];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        startNode = Integer.parseInt(br.readLine());

        for(int i=0;i<=V;i++)
            graph.add(new ArrayList<Node>());
        
        for(int i=0;i<E;i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph.get(u).add(new Node(v, w));
        }

        Arrays.fill(d, INF);

        dijkstra(startNode);

        for(int i=1;i<=V;i++) {
            if(d[i] == INF)
                System.out.println("INF");
            else
                System.out.println(d[i]);
        }
    }

    public static void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start, 0));
        d[start] = 0;
        while(!pq.isEmpty()) {
            Node node = pq.poll();
            int index = node.getIndex();
            int distance = node.getDistance();
            if(d[index] < distance) continue;
            for(int i=0;i<graph.get(index).size();i++) {
                int cost = d[index] + graph.get(index).get(i).getDistance();
                if(cost < d[graph.get(index).get(i).getIndex()]) {
                    d[graph.get(index).get(i).getIndex()] = cost;
                    pq.add(new Node(graph.get(index).get(i).getIndex(), cost));
                }
            }
        }
    }
}
