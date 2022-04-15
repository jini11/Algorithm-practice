import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class n15235 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<int[]> queue = new LinkedList<>();
        int[] result = new int[n];
        int count = 1;
        String s = br.readLine();
        for(int i=0;i<n;i++)
            queue.add(new int[] {i, Integer.parseInt(s.split(" ")[i])});
        
        while(!queue.isEmpty()) {
            int[] pizza = queue.poll();
            if(pizza[1] == 1) {
                result[pizza[0]] = count;
            } else {
                queue.add(new int[] {pizza[0], pizza[1]-1});
            }
            count++;
        }
        for(int i=0;i<n;i++)
            System.out.print(result[i]+" ");
    }   
}
