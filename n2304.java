import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n2304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[][] col = new int[N][2];
        int max = 0;
        int mid = 0;
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            col[i][0] = Integer.parseInt(st.nextToken());
            col[i][1] = Integer.parseInt(st.nextToken());
            if (max < col[i][1]) {
                max = col[i][1];
                mid = i;
            }
        }

        Arrays.sort(col, ((o1, o2) -> o1[0] - o2[0]));

        int area = 0;
        int tmp = col[0][1];
        for (int i=0; i<mid; i++) {
            if (tmp < col[i][1]) {

            } else {
                
            }
        }

        for (int i=N-1; i>mid; i--)


        System.out.println(area+max);
    }
}
