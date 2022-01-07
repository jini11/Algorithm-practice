import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class n1931_2 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        int result = 0;
        for(int i=0;i<n;i++) {
            String str = br.readLine();
            arr[i][0] = Integer.parseInt(str.split(" ")[0]);
            arr[i][1] = Integer.parseInt(str.split(" ")[1]);
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1])
                    return o1[0]-o2[0]; // 시작시간이 빠른 순으로
                return o1[1]-o2[1] ;
            }
        });

        int time = 0;

        for(int i=0;i<n;i++) {
            if(time <= arr[i][0]) {
                time = arr[i][1];
                result++;
            }
        }

        bw.write(result+"\n");
       
        br.close();
        bw.flush();
        bw.close();
    }
}
