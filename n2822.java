import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class n2822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer[] arr = new Integer[8];
        int[] copy = new int[8];
        int num[] = new int[5];
        int sum = 0;
        for(int i=0;i<8;i++) {
            Integer tmp = Integer.parseInt(br.readLine());
            arr[i] = tmp;
            copy[i] = tmp;
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i=0;i<5;i++) {
            for(int j=0;j<8;j++) {
                if(arr[i] == copy[j]) {
                    num[i] = j+1;
                    sum += arr[i];
                }
            }
        }
        Arrays.sort(num);
        System.out.println(sum);
        for(int i=0;i<5;i++)
            System.out.print(num[i]+" ");
    }
}
/*
1: 20  20
2: 30  30
3: 50  50
4: 48  48
5: 33  33
6: 66  66
7: 0   0
8: 64  64

8: 64
6: 66
3: 50
4: 46
5: 33

 */