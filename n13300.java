import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.Map.Entry;

public class n13300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int room = 0;

        HashMap<Integer, Integer> girls = new HashMap<>();
        HashMap<Integer, Integer> boys = new HashMap<>();

        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int grade = Integer.parseInt(st.nextToken());
            if (gender == 0) {
                girls.put(grade, girls.getOrDefault(grade, 0) + 1);
            } else {
                boys.put(grade, boys.getOrDefault(grade, 0) + 1);
            }
        }

        for (Entry<Integer, Integer> list : girls.entrySet()) {
            int gradeTotal = list.getValue();
            room += gradeTotal / K;
            if (gradeTotal % K != 0) {
                room += 1;
            }
        }

        for (Entry<Integer, Integer> list : boys.entrySet()) {
            int gradeTotal = list.getValue();
            room += gradeTotal / K;
            if (gradeTotal % K != 0) {
                room += 1;
            }
        }

        System.out.println(room);
    }
}
