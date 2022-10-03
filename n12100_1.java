import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n12100_1 {
    static int N;
    static int[][] map;
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        
        for(int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0);

        System.out.println(max);
    }
    public static void dfs(int depth) {
        if(depth == 5) {
            chkBlock();
            return;
        }
        int[][] copy = new int[N][N]; // copy 과정에서 틀림
        for(int i=0;i<N;i++) { // 깊은 복사로 해야함(이부분에서 틀림)
            copy[i] = map[i].clone();
        }
        
        for(int i=0;i<4;i++) {
            move(i);
            dfs(depth+1);
            for(int j=0;j<N;j++) // 깊은 복사로 해야함
                map[j] = copy[j].clone();
        }
    }
    
    public static void move(int d) {
        if(d == 0) { // 위로
            for(int i=0;i<N;i++) {
                int idx = 0;
                int block = 0;
                for(int j=0;j<N;j++) {
                    if(map[j][i] != 0) {
                        if(block == map[j][i]) {
                            map[idx-1][i] = block * 2;
                            block = 0;
                            map[j][i] = 0;
                        } else {
                            block = map[j][i];
                            map[j][i] = 0;
                            map[idx][i] = block;
                            idx++;
                        }
                    }
                }
            }
        } else if(d == 1) { // 아래
            for(int i=0;i<N;i++) {
                int idx = N-1;
                int block = 0;
                for(int j=N-1;j>=0;j--) {
                    if(map[j][i] != 0) {
                        if(block == map[j][i]) {
                            map[idx+1][i] = block * 2;
                            block = 0;
                            map[j][i] = 0;
                        } else {
                            block = map[j][i];
                            map[j][i] = 0;
                            map[idx][i] = block;
                            idx--;
                        }
                    }
                }
            }
        } else if(d == 2) { // 왼쪽
            for(int i=0;i<N;i++) {
                int idx = 0;
                int block = 0;
                for(int j=0;j<N;j++) {
                    if(map[i][j] != 0) {
                        if(block == map[i][j]) {
                            map[i][idx-1] = block * 2;
                            block = 0;
                            map[i][j] = 0;
                        } else {
                            block = map[i][j];
                            map[i][j] = 0;
                            map[i][idx] = block;
                            idx++;
                        }
                    }
                }
            }
        }
        else if(d == 3) { // 오른쪽
            for(int i=0;i<N;i++) {
                int idx = N-1;
                int block = 0;
                for(int j=N-1;j>=0;j--) {
                    if(map[i][j] != 0) {
                        if(block == map[i][j]) {
                            map[i][idx+1] = block * 2;
                            block = 0;
                            map[i][j] = 0;
                        } else {
                            block = map[i][j];
                            map[i][j] = 0;
                            map[i][idx] = block;
                            idx--;
                        }
                    }
                }
            }
        }
        
    }

    public static void chkBlock() {
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                max = Math.max(max, map[i][j]);
            }
        }
    }
}
