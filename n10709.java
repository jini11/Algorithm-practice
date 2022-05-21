import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n10709 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        char[][] map = new char[h][w];
        int[][] cloud = new int[h][w];
        int cnt = 0;
        for(int i=0;i<h;i++) {
            String s = br.readLine();
            for(int j=0;j<w;j++) {
                map[i][j] = s.charAt(j);
                if(map[i][j] == '.' && cnt == 0)
                    System.out.print(-1+" ");
                else if(map[i][j] == 'c') {
                    System.out.print(0+" ");
                    cnt = 1;
                } else if(map[i][j] == '.' && cnt != 0) {
                    System.out.print(cnt+" ");
                    cnt++;
                }
            }
            System.out.println();
            cnt=0;
        }
    }
}
