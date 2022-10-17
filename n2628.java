import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n2628 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int width = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());
        int[] row = new int[height+1];
        int[] col = new int[width+1];
        int cut = Integer.parseInt(br.readLine());
        for (int i=0; i<cut; i++) {
            st = new StringTokenizer(br.readLine());
            int dir = Integer.parseInt(st.nextToken());
            int idx = Integer.parseInt(st.nextToken());
            if (dir == 0) { // 가로
                row[idx] = 1;
            } else {
                col[idx] = 1;
            }
        }

        int maxWidth = 0;
        int maxHeight = 0;
        int cnt = 0;
        for (int i=1; i<=height; i++) {
            cnt++;
            if (row[i] == 1 || i == height) {
                maxWidth = Math.max(maxWidth, cnt);
                cnt = 0;
            }
        }

        cnt = 0;
        for (int i=1; i<=width; i++) {
            cnt++;
            if (col[i] == 1 || i == width) {
                maxHeight = Math.max(maxHeight, cnt);
                cnt = 0;
            }
        }

        System.out.println(maxHeight * maxWidth);
    }
}
/* 
 * 1 2 3 4 5 6 7 8 9 10 col
 * 0 0 0 1 0 0 0 0 0 0
 * 
 * 1 2 3 4 5 6 7 8 row
 * 0 1 1 0 0 0 0 0
 */