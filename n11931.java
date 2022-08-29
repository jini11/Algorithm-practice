import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class n11931 { // 계수정렬
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[2000001]; // 절댓간이 1000000 => 음수, 양수 총 2000000
        for(int i=0;i<n;i++)
            arr[Integer.parseInt(br.readLine())+1000000]++;
        
        for(int i=2000000;i>=0;i--) {
            while(arr[i]>0) {
                bw.write((i-1000000)+"\n");
                arr[i]--;
            }
        }
        bw.flush();
    }
}