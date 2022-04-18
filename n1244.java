import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n1244 {
    static int n, std;
    static int[] arr;
    static int[][] change;
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        arr = new int[n+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++)
            arr[i] = Integer.parseInt(st.nextToken());
        std = Integer.parseInt(br.readLine());
        change = new int[std][2];
        for(int i=0;i<std;i++) {
            st = new StringTokenizer(br.readLine());
            change[i][0] = Integer.parseInt(st.nextToken());
            change[i][1] = Integer.parseInt(st.nextToken());
        }
        light();
        for(int i=1;i<=n;i++) {
            System.out.print(arr[i]+" ");
            if(i%20==0)
                System.out.println();
        }
    }
    public static void light() {
        for(int i=0;i<std;i++) {
            int gender = change[i][0];
            int button = change[i][1];

            if(gender == 1) {
                for(int j=1;j<=n;j++) {
                    if(j%button==0)
                        arr[j] = (arr[j] == 1 ? 0 : 1);
                }
            } else {
                int count = 1;
                arr[button] = arr[button] == 1 ? 0 : 1;
                while(true) {
                    if(button-count <= 0 || button+count > n) break;
                    if(arr[button-count] == arr[button+count]) {
                        arr[button-count] = arr[button-count] == 1 ? 0 : 1;
                        arr[button+count] = arr[button+count] == 1 ? 0 : 1;
                    } else break;
                    count++;
                }
            }
        }
    }
}
