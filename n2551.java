import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class n2551 {
    static int a, b, c;
    static ArrayList<Integer> list;
    public static void main(String []args) { //다시 풀어보기
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        list = new ArrayList<>();

        bfs();

        Collections.sort(list);
        for(int i=0;i<list.size();i++)
            System.out.print(list.get(i)+" ");
    }
    public static void bfs() {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][][] visited = new boolean[a+1][b+1][c+1];

        queue.add(new int[] {0, 0, c});
        while(!queue.isEmpty()) {
            int[] arr = queue.poll();
            if(visited[arr[0]][arr[1]][arr[2]])
                continue;
            if(arr[0]==0)
                list.add(arr[2]);
            visited[arr[0]][arr[1]][arr[2]] = true;

            if(arr[0] + arr[1] <= a) { // B -> A
                queue.add(new int[] {arr[0]+arr[1], 0, arr[2]});
            } else {
                queue.add(new int[] {a, arr[0]+arr[1]-a, arr[2]});
            }
            if(arr[0] + arr[2] <= a) { // C -> A
                queue.add(new int[] {arr[0]+arr[2], arr[1], 0});
            } else {
                queue.add(new int[] {a, arr[1], arr[0]+arr[2]-a});
            }
            if(arr[0] + arr[1] <= b) { //A -> B
                queue.add(new int[] {0, arr[0]+arr[1], arr[2]});
            } else {
                queue.add(new int[] {arr[0]+arr[1]-b, b, arr[2]});
            }
            if(arr[1] + arr[2] <= b) { // C -> B
                queue.add(new int[] {arr[0], arr[1]+arr[2], 0});
            } else {
                queue.add(new int[] {arr[0], b, arr[1]+arr[2]-b});
            }
            if(arr[0] + arr[2] <= c) { // A -> C
                queue.add(new int[] {0, arr[1], arr[0]+arr[2]});
            } else {
                queue.add(new int[] {arr[0]+arr[2]-c, arr[1], c});
            }
            if(arr[1] + arr[2] <= c) { // B -> C
                queue.add(new int[] {arr[0], 0, arr[1]+arr[2]});
            } else {
                queue.add(new int[] {arr[0]+arr[2]-c, arr[1], c});
            }
        }
    }
}
