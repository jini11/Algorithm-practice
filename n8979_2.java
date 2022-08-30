import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class n8979_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] score = new int[n][5];
        
        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            score[i][0] = Integer.parseInt(st.nextToken());
            score[i][1] = Integer.parseInt(st.nextToken());
            score[i][2] = Integer.parseInt(st.nextToken());
            score[i][3] = Integer.parseInt(st.nextToken());
            score[i][4] = 1;
            // int num = Integer.parseInt(st.nextToken());
            // int gold = Integer.parseInt(st.nextToken());
            // int silver = Integer.parseInt(st.nextToken());
            // int bronze = Integer.parseInt(st.nextToken());
            //score.add(new int[] {num, gold, silver, bronze});
        }

        Arrays.sort(score, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]<o2[1]){
                    return 1;
                } else if(o1[1]==o2[1]){
                    if(o1[2]<o2[2]){
                        return 1;
                    } else if(o1[2]==o2[2]){
                        if(o1[3]<o2[3]){
                            return 1;
                        } else if(o1[3]==o2[3]){
                            if(o1[0]>o2[1]){ // 모두 같은 경우에는 국가를 나타내는 정수를 오름차순으로 정렬
                                return 1;
                            }
                        }
                    }
                }
                return -1;
            }
            
        });

        for(int i=1;i<n;i++) {
            if(score[i][1] == score[i-1][1] && score[i][2] == score[i-1][2] && score[i][3] == score[i-1][3]) {
                score[i][4] = score[i-1][4];
            } else {
                score[i][4] = i + 1;
            }
        }

        for(int i=0;i<n;i++) {
            if(score[i][0] == k) {
                System.out.println(score[i][4]);
                break;
            }
        }
        
    }
}
