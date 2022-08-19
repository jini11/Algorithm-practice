import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        boolean[][] arr = new boolean[n][m];
                
        for(int i=0;i<n;i++) {
            String input = br.readLine();
            for(int j=0;j<m;j++) {
                char c = input.charAt(j);
                if(c == 'W') arr[i][j] = false; // 'W'
                else arr[i][j] = true; // 'B'
            }
        }

        int answer = Integer.MAX_VALUE;
        for(int i=0;i<n-7;i++) {
            for(int j=0;j<m-7;j++) {
                int tmp = check(arr, i, j);
                answer = Math.min(tmp, answer);
            }
        }
        System.out.println(answer);
    }
    public static int check(boolean[][] arr, int x, int y) {
        int cntWhite = 0;
        boolean chk = false;
        for(int i=x;i<x+8;i++) {
            for(int j=y;j<y+8;j++) {
                if(chk != arr[i][j]) 
                    cntWhite++;    
                chk = !chk;
            }
            chk = !chk;
        }
        return Math.min(cntWhite, 64-cntWhite);
    }
}
