import java.util.Scanner;

public class n14499 {
    static int n, m, x, y, k;
    static int[][] map;
    static int[] dice = new int[7];
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        k = sc.nextInt();
        map = new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                map[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<k;i++) {
            int c = sc.nextInt();
            int nx = x + dx[c-1];
            int ny = y + dy[c-1];
            if(nx>=0 && ny>=0 && nx<n && ny<m) {
                roll(c);
                if(map[nx][ny] == 0) {
                    map[nx][ny] = dice[6];
                } else {
                    dice[6] = map[nx][ny];
                    map[nx][ny] = 0;
                }
                x = nx;
                y = ny;
                System.out.println(dice[1]);
            }
        }
    }
    public static void roll(int c) {
        int[] temp = dice.clone();
        switch(c) {
            case 1: //동
                dice[1] = temp[4];
                dice[3] = temp[1];
                dice[4] = temp[6];
                dice[6] = temp[3];
                break;
            case 2: //서
                dice[1] = temp[3];
                dice[3] = temp[6];
                dice[4] = temp[1];
                dice[6] = temp[4];
                break;
            case 3: //북
                dice[1] = temp[5];
                dice[2] = temp[1];
                dice[5] = temp[6];
                dice[6] = temp[2];
                break;
            case 4: //남
                dice[1] = temp[2];
                dice[2] = temp[6];
                dice[5] = temp[1];
                dice[6] = temp[5];
                break;
        }
    }
}
