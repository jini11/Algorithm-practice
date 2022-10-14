import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n10163 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[1001][1001];
        int[] answer = new int[n];
        int idx = 1;
        for (int t=0; t<n; t++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int width = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());

            for (int i=x; i<x+width; i++) {
                for (int j=y; j<y+height; j++) {
                    map[i][j] = idx;
                }
            }
            idx++;
        }

        for (int i=0; i<1001; i++) {
            for (int j=0; j<1001; j++) {
                if (map[i][j] != 0) {
                    answer[map[i][j] - 1] += 1;
                }
            }
        }

        for (int i=0; i<answer.length; i++)
            System.out.println(answer[i]);
    }
}
