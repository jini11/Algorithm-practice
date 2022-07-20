import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n1780 {
    
    static int[][] map;
    static int minus = 0;
    static int zero = 0;
    static int one = 0;

    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        map = new int[n][n];

        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++)
                map[i][j] = Integer.parseInt(st.nextToken());
        }

        recur(0, 0, n);

        System.out.println(minus);
        System.out.println(zero);
        System.out.println(one);
    }

    public static void recur(int r, int c, int n) {
        if(check(r, c, n)) {
            if(map[r][c] == -1)
                minus++;
            else if(map[r][c] == 0)
                zero++;
            else if(map[r][c] == 1)
                one++;
        } else {
            int tmp = n / 3;
            for(int i=0;i<3;i++) {
                for(int j=0;j<3;j++) {
                    recur(r + tmp * i, c + tmp * j, tmp);
                }
            }
        }
    }

    public static boolean check(int r, int c, int n) {
        int tmp = map[r][c];
        for(int i=r;i<r+n;i++) {
            for(int j=c;j<c+n;j++) {
                if(tmp != map[i][j])
                    return false;
            }
        }
        return true;
    }
}
