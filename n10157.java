import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n10157 {
    static int C, R, num;
    static int[][] map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        map = new int[R+1][C+1];
        num = Integer.parseInt(br.readLine());

        if (num > C*R) {
            System.out.println(0);
            return;
        }
        int[] answer = chkSeat();
        
        System.out.println(answer[0] + " " + answer[1]);
    }

    public static int[] chkSeat() {
        int N = 1;
        int x = 1;
        int y = 1;
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        int idx = 0;
        while(true) {
            map[x][y] = N;

            if (N == num) 
                break;

            if (x + dx[idx] > R || y + dy[idx] > C || x + dx[idx] < 1 || y + dy[idx] < 1 || map[x+dx[idx]][y+dy[idx]] != 0) {
                idx++;
            }

            if (idx == 4) idx = 0;

            x += dx[idx];
            y += dy[idx];

            N++;

            if (N > R * C)
                break;
        }

        return new int[] {y, x};
    }
}