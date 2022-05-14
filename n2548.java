import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class n2548 {
    public static void main (String args[]) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        int N = Integer.parseInt(br.readLine()); 
        String str2[] = br.readLine().split(" "); 
        int arr[] = new int[10001]; 
        for (int i = 0; i < N; i++) { 
            int number = Integer.parseInt(str2[i]); 
            arr[number]++; 
        } 
        int count = 0; 
        int idx = 1; 
        while (Math.round(N / 2.0f) != count) { 
            if (arr[idx] > 0) { 
                arr[idx]--; 
                count++; 
            } else idx++; 
        } 
        bw.write(String.valueOf(idx)); 
        bw.flush(); 
    }
}
