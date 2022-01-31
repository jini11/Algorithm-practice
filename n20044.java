import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class n20044 {
    public static void main(String []args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n*2];
        for(int i=0;i<n*2;i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int min = 400000;
        for(int i=0;i<n;i++) {
            int temp = arr[i] + arr[arr.length-1-i];
            if(min > temp) min = temp;
        }
        System.out.println(min);
    }
}
