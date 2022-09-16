import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n1051 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s.split(" ")[0]);
        int m = Integer.parseInt(s.split(" ")[1]);
        int[][] map = new int[n][m];
        int len = Math.min(n, m);

        for(int i=0;i<n;i++) {
            s = br.readLine();
            for(int j=0;j<m;j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }
        while(true) {
            if(len == 1) break;
            for(int i=0;i<=n-len;i++) {
                for(int j=0;j<=m-len;j++) {
                    int num = map[i][j];
                    if(map[i][j+len-1] == num && map[i+len-1][j] == num && map[i+len-1][j+len-1] == num) {
                        System.out.println(len*len);
                        return;
                    }
                }
            }
            len--;
        }
        System.out.println(len*len);
    }
}
