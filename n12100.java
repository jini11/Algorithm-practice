import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n12100 {
    static int[][] map;
    static int result = 0, n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0);
        System.out.println(result);
    }
    public static void dfs(int cnt) {
        if(cnt == 5) {
            result = Math.max(result, chkNum());
            return;
        }
        int[][] copy = new int[n][n];
        copy = map;

        for(int i=0;i<4;i++) {
            move(i);
            dfs(cnt+1);
            map = copy;
        }
    }
    public static void move(int d) {
        switch(d) {
            case 0: // 위
                for(int i=0;i<n;i++) {
                    int num = 0;
                    int idx = 0;
                    for(int j=0;j<n;j++) {
                        if(map[j][i] != 0) {
                            if(map[j][i] == num) {
                                map[idx-1][i] = num * 2;
                                num = 0;
                                map[j][i] = 0;
                            } else {
                                num = map[j][i];
                                map[j][i] = 0;
                                map[idx++][i] = num;
                            }
                        }
                    }
                }
                break;
            case 1: // 왼
                for(int i=0;i<n;i++) {
                    int num = 0;
                    int idx = 0;
                    for(int j=0;j<n;j++) {
                        if(map[i][j] != 0) {
                            if(map[i][j] == num) {
                                map[i][idx-1] = num*2;
                                num = 0;
                                map[i][j] = 0;
                            } else {
                                num = map[i][j];
                                map[i][j] = 0;
                                map[i][idx++] = num;
                            }
                        }
                    }
                }
                break;
            case 2: // 오
                for(int i=0;i<n;i++) {
                    int num = 0;
                    int idx = n-1;
                    for(int j=n-1;j>=0;j--) {
                        if(map[j][i] != 0) {
                            if(map[j][i] == num) {
                                map[idx+1][i] = num*2;
                                num = 0;
                                map[j][i] = 0;
                            } else {
                                num = map[j][i];
                                map[j][i] = 0;
                                map[idx--][i] = num;
                            }
                        }
                    }
                }
                break;
            case 3: // 아래
                for(int i=0;i<n;i++) {
                    int num = 0;
                    int idx = n-1;
                    for(int j=n-1;j>=0;j--) {
                        if(map[i][j] != 0) {
                            if(map[i][j] == num) {
                                map[i][idx+1] = num*2;
                                map[i][j] = 0;
                                num = 0;
                            } else {
                                num = map[i][j];
                                map[i][j] = 0;
                                map[i][idx--] = num;
                            }
                        }
                    }
                }
                break;
        }
    }

    public static int chkNum() {
        int max = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                max = Math.max(max, map[i][j]);
            }
        }
        return max;
    }
}
