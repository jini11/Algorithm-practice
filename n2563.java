import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n2563 {
    static final int size = 100;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[][] map = new int[size][size];
        int total = 0;

        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int j=x; j<x+10; j++) {
                for (int k=y; k<y+10; k++) {
                    map[j][k] = 1;
                }
            }
        }

        for (int i=0; i<size; i++) {
            for (int j=0; j<size; j++) {
                if (map[i][j] == 1) total++;
            }
        }

        System.out.println(total);
    }
}
