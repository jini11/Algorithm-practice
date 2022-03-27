import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n14891 {
    static int[][] arr = new int[4][8];
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for(int i=0;i<4;i++) {
            String line = br.readLine();
            for(int j=0;j<8;j++)
                arr[i][j] = line.charAt(j) - '0';
        }
        int k = Integer.parseInt(br.readLine());
        for(int i=0;i<k;i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int dir = Integer.parseInt(st.nextToken());
            check(num-1, dir);
        }
        int count = 0;
        int[] score = {1, 2, 4, 8};
        for(int i=0;i<4;i++) {
            if(arr[i][0] == 1) 
                count += score[i];
        }
        System.out.println(count);
    }
    public static void check(int num, int dir) {
        left(num - 1, -dir); // 왼쪽 
        right(num + 1, -dir); // 오른쪽
        rotate(num, dir); // 자신
    }
    public static void left(int num, int dir) { // 회전 여부
        if(num < 0) return;
        if(arr[num][2] != arr[num+1][6]) {
            left(num - 1, -dir);
            rotate(num, dir);
        }
    }
    public static void right(int num, int dir) { // 회전 여부
        if(num > 3) return;
        if(arr[num][6] != arr[num-1][2]) {
            right(num + 1, -dir);
            rotate(num, dir);
        }
    }
    public static void rotate(int num, int dir) { // 회전
        if(dir == 1) { // 시계
            int temp = arr[num][7];
            for(int i=7;i>0;i--)
                arr[num][i] = arr[num][i-1];
            arr[num][0] = temp;
        } else { // 반시계
            int temp = arr[num][0];
            for(int i=0;i<7;i++)
                arr[num][i] = arr[num][i+1];
            arr[num][7] = temp;
        }
    }
}
