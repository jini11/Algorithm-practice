import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class n1475 {
    public static void main(String []args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int[] num = new int[10];
        for(int i=0;i<input.length();i++) {
            int n = input.charAt(i) - '0';
            if(n == 9)
                n = 6;
            num[n]++;
        }
        num[6] = num[6]/2 + num[6]%2;
        Arrays.sort(num);
        System.out.println(num[9]);
    }
}
