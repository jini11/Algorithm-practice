import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class n12018 {
    public static void main(String []args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String temp = br.readLine();
        int n = Integer.parseInt(temp.split(" ")[0]);
        int m = Integer.parseInt(temp.split(" ")[1]);
        int[] result = new int[n];
        int count = 0;
        for(int i=0;i<n;i++) {
            String num = br.readLine();
            int sub = Integer.parseInt(num.split(" ")[0]);
            int full = Integer.parseInt(num.split(" ")[1]);
            String s = br.readLine();
            Integer[] score = new Integer[sub];
            for(int j=0;j<sub;j++)
                score[j] = Integer.parseInt(s.split(" ")[j]);
            if(sub>=full) {
                Arrays.sort(score, Collections.reverseOrder());
                result[i] = score[full-1];
            }
            else result[i] = 1;
        }
        Arrays.sort(result);
        int sum = 0;
        for(int i=0;i<n;i++) {
            sum += result[i];
            if(sum > m) break;
            count++;
        }
        System.out.println(count);
    }
}
