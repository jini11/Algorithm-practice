import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n14696 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        for (int t=0; t<N; t++) {
            int[] a = new int[5];
            int[] b = new int[5];
            st = new StringTokenizer(br.readLine());
            int aLen = Integer.parseInt(st.nextToken());
            for (int i=0; i<aLen; i++)
                a[Integer.parseInt(st.nextToken())] += 1;
            
            st = new StringTokenizer(br.readLine());
            int bLen = Integer.parseInt(st.nextToken());
            for (int i=0; i<bLen; i++)
                b[Integer.parseInt(st.nextToken())] += 1;

            // 별: 4, 동그라미: 3, 네모:2, 세모: 1
            if (a[4] != b[4]) {
                if (a[4] > b[4]) {
                    sb.append("A\n");
                } else {
                    sb.append("B\n");
                }
            } else if (a[3] != b[3]) {
                if (a[3] > b[3]) {
                    sb.append("A\n");
                } else {
                    sb.append("B\n");
                }
            } else if (a[2] != b[2]) {
                if (a[2] > b[2]) {
                    sb.append("A\n");
                } else {
                    sb.append("B\n");
                }
            } else if (a[1] != b[1]) {
                if (a[1] > b[1]) {
                    sb.append("A\n");
                } else {
                    sb.append("B\n");
                }
            } else {
                sb.append("D\n");
            }
        }

        System.out.println(sb.toString());
    }
}
