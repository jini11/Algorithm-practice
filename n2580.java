import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n2580 {
    static int[][] map = new int[9][9];
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for(int i=0;i<9;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<9;j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        puzzle(0, 0);
    }
    public static void puzzle(int x, int y) { // 재귀함수이자, 1~9 넣기
        if(y==9) {
            puzzle(x+1, 0);
            return;
        }
        if(x==9) {
            for(int i=0;i<9;i++) {
                for(int j=0;j<9;j++)
                    System.out.print(map[i][j]+" ");
                System.out.println();
            }
            System.exit(0);
        }

        if(map[x][y]==0) {
            for(int i=1;i<=9;i++) {
                if(check(x, y, i)) {
                    map[x][y] = i;
                    puzzle(x, y+1);
                }
            }
            map[x][y] = 0;
            return;
        }
        puzzle(x, y+1);
    }
    public static boolean check(int x, int y, int num) { // 가로줄, 세로줄, 3x3 검사 후 결과 반환
        for(int i=0;i<9;i++) {
            if(map[x][i] == num) 
                return false;
            if(map[i][y] == num)
                return false;
        }
        int nx = x/3 * 3;
        int ny = y/3 * 3;
        for(int i=nx;i<nx+3;i++) {
            for(int j=ny;j<ny+3;j++) {
                if(map[i][j] == num) return false;
            }
        }
        return true;
    }

}