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
            return -1; // 오름차순?
        return 1;
    }

}

public class n1916 {
    static final int INF = (int) 1e9;
    static int n, m, startNode, endNode;
    static ArrayList<ArrayList<Node>> graph = new ArrayList<>();
    static int[] d = new int[1001]; // 최단 거리 테이블
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        for(int i=0;i<=n;i++) // 그래프 초기화
            graph.add(new ArrayList<Node>());

        for(int i=0;i<m;i++) { // 간선 정보 입력
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            graph.get(x).add(new Node(y, z)); // x번 노드에서 y번 노드로 가는 비용이 z이다
        }
        st = new StringTokenizer(br.readLine());
        startNode = Integer.parseInt(st.nextToken());
        endNode = Integer.parseInt(st.nextToken());

        Arrays.fill(d, INF); // 최단 거리 테이블 초기화

        dijkstra(startNode);

        System.out.println(d[endNode]);
    }

    public static void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));
        d[start] = 0;
        while(!pq.isEmpty()) {
            Node node = pq.poll();
            int curNode = node.getIndex();
            int curDistance = node.getDistance();
            if(d[curNode] < curDistance) continue;
            for(int i=0;i<graph.get(curNode).size();i++) {
                int cost = d[curNode] + graph.get(curNode).get(i).getDistance();
                if(cost < d[graph.get(curNode).get(i).getIndex()]) {
                    d[graph.get(curNode).get(i).getIndex()] = cost;
                    pq.offer(new Node(graph.get(curNode).get(i).getIndex(), cost));
                }
            }
        }
    }
}
