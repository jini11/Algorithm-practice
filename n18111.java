import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n18111 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[][] map = new int[n][m];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                min = Math.min(min, map[i][j]);
                max = Math.max(max, map[i][j]);
            }
        }

        int[] answer = new int[2];
        answer[0] = Integer.MAX_VALUE;
        for(int t=min;t<=max;t++) {
            int sec = 0;
            int block = b;

            for(int i=0;i<n;i++) {
                for(int j=0;j<m;j++) {
                    int dif = map[i][j] - t;

                    if(dif > 0) {
                        sec += Math.abs(dif) * 2;
                        block += Math.abs(dif);
                    } else if(dif < 0) {
                        sec += Math.abs(dif);
                        block -= Math.abs(dif);
                    }
                }
            }
            if(block < 0) continue;
            if(answer[0] >= sec) {
                answer[0] = sec;
                answer[1] = t;
            }
        }
        System.out.println(answer[0] + " " + answer[1]);
    }
}

// (1) 최소 시간 (2) 땅의 높이
// 1. 땅을 깎을건지()
// 2. 땅을 쌓을건지(인벤토리에 땅이 충분히 있으면)

//최소 층과 최대 층을 알아야함