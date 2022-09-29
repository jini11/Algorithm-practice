import java.util.Scanner;

public class n3085 {
    static int answer = Integer.MIN_VALUE;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        char[][] map = new char[n][n];
        for(int i=0;i<n;i++) {
            map[i] = sc.next().toCharArray();
        }

        chkCandy(map);

        for(int i=0;i<n;i++) {
            for(int j=0;j<n-1;j++) { // 열
                if(map[i][j] != map[i][j+1]) {
                    char c = map[i][j];
                    map[i][j] = map[i][j+1];
                    map[i][j+1] = c;

                    chkCandy(map);

                    c = map[i][j];
                    map[i][j] = map[i][j+1];
                    map[i][j+1] = c;
                }
            }
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<n-1;j++) { // 행
                if(map[j][i] != map[j+1][i]) {
                    char c = map[j][i];
                    map[j][i] = map[j+1][i];
                    map[j+1][i] = c;

                    chkCandy(map);

                    c = map[j][i];
                    map[j][i] = map[j+1][i];
                    map[j+1][i] = c;
                }
            }
        }

        System.out.println(answer);
    }
    public static void chkCandy(char[][] map) {

        for(int i=0;i<n;i++) { // 열
            int sum = 1;
            for(int j=0;j<n-1;j++) {
                if(map[i][j] == map[i][j+1]) {
                    sum++;
                } else sum = 1;
            }
            answer = Math.max(answer, sum);
        }

        for(int i=0;i<n;i++) {
            int sum = 1;
            for(int j=0;j<n-1;j++) {
                if(map[j][i] == map[j+1][i]) {
                    sum++;
                } else sum = 1;
            }
            answer = Math.max(answer, sum);
        }
    }
}
