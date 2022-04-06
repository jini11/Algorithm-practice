import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n14890 {
    static int[][] map;
    static int n, l, count;
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());
        map = new int[n][n];
        count = 0;
        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++)
                map[i][j] = Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<n;i++) {
            if(path_row(i)) count++; //열
            if(path_col(i)) count++; //행
        }
        System.out.println(count);
    }
    public static boolean path_row(int row) {
        boolean[] climb = new boolean[n]; // 경사면
        for(int i=0;i<n-1;i++) {
            int temp = map[row][i+1] - map[row][i];
            if(temp<-1 || temp>1) return false; // 경사면 높이차가 1 초과이면 실패
            if(temp == -1) { // 지금 > 다음
                for(int j=1;j<=l;j++) { // j값 중요
                    if(i+j>=n || climb[i+j]) return false;
                    if(map[row][i]-1 != map[row][i+j]) return false;
                    climb[i+j] = true;
                }
            } else if(temp == 1) { // 지금 < 다음
                for(int j=0;j<l;j++) {
                    if(i-j<0 || climb[i-j]) return false;
                    if(map[row][i] != map[row][i-j]) return false;
                    climb[i-j] = true;
                }
            }
        }
        return true; 
    }
    public static boolean path_col(int col) {
        boolean[] climb = new boolean[n]; // 경사면
        for(int i=0;i<n-1;i++) {
            int temp = map[i+1][col] - map[i][col];
            if(temp<-1 || temp>1) return false; // 경사면 높이차가 1 초과이면 실패
            if(temp == -1) { // 지금 > 다음
                for(int j=1;j<=l;j++) { // j값 중요
                    if(i+j>=n || climb[i+j]) return false;
                    if(map[i][col]-1 != map[i+j][col]) return false;
                    climb[i+j] = true;
                }
            } else if(temp == 1) { // 지금 < 다음
                for(int j=0;j<l;j++) {
                    if(i-j<0 || climb[i-j]) return false;
                    if(map[i][col] != map[i-j][col]) return false;
                    climb[i-j] = true;
                }
            }
        }
        return true;
    }
}
