import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class n9237 {
    public static void main(String []args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] tree = new int[n];
        int day = 2;
        int max = 0;
        for(int i=0;i<n;i++)
            tree[i] = sc.nextInt();

        Arrays.sort(tree);

        for(int i=tree.length-1;i>=0;i--) {
            if(tree[i]+day > max) {
                max = tree[i] + day;
            }
            day++;
        }
        System.out.println(max);
    }
}
