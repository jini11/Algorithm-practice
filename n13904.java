import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class n13904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        List<int[]> homework = new ArrayList<>();
        int maxDay = 0;
        int answer = 0;
        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            homework.add(new int[] {d, w});
            maxDay = Math.max(maxDay, d);
        }
        homework.sort((o1, o2) -> o1[0]==o2[0] ? o2[1]-o1[1] : o2[0]-o1[0]);
        boolean[] checked = new boolean[homework.size()];
        for(int i=maxDay;i>0;i--) {
            int[] tmp = new int[2];
            for(int j=0;j<homework.size();j++) {
                if(tmp[1] < homework.get(j)[1] && !checked[j] && i <= homework.get(j)[0]) {
                    tmp[1] = homework.get(j)[1];
                    tmp[0] = j;
                }
            }
            answer += tmp[1];
            checked[tmp[0]] = true;
        }
        System.out.println(answer);
    }
}
