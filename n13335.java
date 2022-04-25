import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class n13335 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s.split(" ")[0]); // 트럭 수
        int w = Integer.parseInt(s.split(" ")[1]); // 다리 길이
        int l = Integer.parseInt(s.split(" ")[2]); // 하중

        int time = 0;
        Queue<Integer> truck = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();

        String input = br.readLine();
        for(int i=0;i<n;i++)
            truck.add(Integer.parseInt(input.split(" ")[i]));
        for(int i=0;i<w;i++)
            queue.add(0);
        
        int sum = 0;
        while(!queue.isEmpty()) {
            time++;
            sum -= queue.poll(); //다리에서 트럭 빼기
            if(!truck.isEmpty()) {
                if(truck.peek() + sum <= l) {
                    sum += truck.peek();
                    queue.add(truck.poll());
                } else  queue.add(0);
            }
        }
        System.out.println(time);


    } 
}
