import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n2669 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] arr = new int[4][4];
        int max = 0;
        int cnt = 0;
        for (int i=0; i<4; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<4; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max, arr[i][j]);
            }
        }
        boolean[][] chk = new boolean[max+1][max+1];
        for (int k=0; k<4; k++) {
            for (int i=arr[k][0]; i<arr[k][2]; i++) {
                for (int j=arr[k][1]; j<arr[k][3]; j++) {
                    chk[i][j] = true;
                }
            }
        }

        for (int i=0; i<=max; i++) {
            for (int j=0; j<=max; j++) {
                if (chk[i][j]) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
