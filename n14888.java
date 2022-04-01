import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n14888 {
    static int n;
    static int nmax = Integer.MIN_VALUE;
    static int nmin = Integer.MAX_VALUE;
    static int[] arr;
    static int[] op = new int[4]; // 0: +, 1: -, 2: *, 3: /
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        String line = br.readLine();
        for(int i=0;i<n;i++) 
            arr[i] = Integer.parseInt(line.split(" ")[i]);
    
        String input = br.readLine();
        for(int i=0;i<4;i++)   
            op[i] = Integer.parseInt(input.split(" ")[i]);

        dfs(arr[0], 1);
        System.out.println(nmax);
        System.out.println(nmin);
    }
    public static void dfs(int num, int index) {
        if(index == n) {
            nmax = Math.max(nmax, num);
            nmin = Math.min(nmin, num);
            return;
        }
        for(int i=0;i<4;i++) {
            if(op[i] > 0) {
                op[i]--;
            
                if(i == 0) // +
                    dfs(num + arr[index], index + 1);
                else if(i == 1) // -
                    dfs(num - arr[index], index + 1);
                else if(i == 2) // *
                    dfs(num * arr[index], index + 1);
                else if(i == 3) // /
                    dfs(num / arr[index], index + 1);

                op[i]++;
            }
            
        }
    }
}
