import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n2564 {
    static int r, c;
    static int[][] map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        c = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());
        int[] dist = new int[n+1];
        int sum = (c+r) * 2;
        int total = 0;
        for (int i=0; i<n+1; i++) {
            st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            int tmp = Integer.parseInt(st.nextToken());
            dist[i] = goRight(d, tmp);
        }

        for (int i=0; i<n; i++) {
            int m = Math.abs(dist[n]-dist[i]);
            total += Math.min(m, sum - m);
        }

        System.out.println(total);
    }
    public static int goRight(int d, int tmp) {
        if (d == 1) { // 북
            return tmp;
        } else if (d == 2) { // 남
            return c+r+c-tmp;
        } else if (d == 3) { // 서
            return c+r+c+r-tmp;
        } else  // 동
            return c+tmp;
    }
}
