import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class n1339 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        int[] alpha = new int[26];
        int answer = 0;
        for(int i=0;i<n;i++) {
            arr[i] = br.readLine();
            for(int j=0;j<arr[i].length();j++) { // 100A + 10A + 1A 변경
                char c = arr[i].charAt(j);
                alpha[c - 'A'] += Math.pow(10, arr[i].length()-j-1); // A 자리에 111 저장
            }
        }
        Arrays.sort(alpha);
        int num = 9;
        for(int i=alpha.length-1;i>=0;i--) {
            if(alpha[i] == 0)
                break;
            answer += alpha[i] * num;
            num--;
        }
        System.out.println(answer);
    }
}
