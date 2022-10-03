import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n15654 {
    static int N, M;
    static int[] arr;
    static boolean[] chk; // 조합할 때 중복을 허용하지 않기 위해
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        arr = new int[N];
        chk = new boolean[N];

        for(int i=0;i<N;i++)
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        dfs(0, 0, sb);

    }
    public static void dfs(int start, int depth, StringBuilder sb) {
        if(depth == M) {
            System.out.println(sb.toString());
            return;
        }

        for(int i=0;i<N;i++) {
            if(!chk[i]) {
                sb.append(arr[i] + " ");
                chk[i] = true;
                dfs(i+1, depth+1, sb);
                sb.delete(sb.length()-Integer.toString(arr[i]).length()-1, sb.length());
                chk[i] = false;
            }                
        }
    }
}
