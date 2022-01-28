import java.io.*;
import java.util.Scanner;

public class n19941 { // 시간초과 다시 풀어볼 것!!!!!!!!!!
    public static void main(String []args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        String line = sc.next();
        String[] arr = new String[n];
        int result = 0;
        for(int i=0;i<arr.length;i++)
            arr[i] = line.split("")[i];
        
        for(int i=0;i<n;i++) {
            if(arr[i].equals("P")) {
                for(int j=Math.max(0,i-k);j<=Math.min(n-1,i+k);j++) {
                    if(arr[j].equals("H")) {
                        arr[j] = "-";
                        result++;
                        break;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
