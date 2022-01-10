import java.io.*;
import java.util.*;

public class n10610 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int sum = 0;
        String result = "";
        String[] arr = str.split("");
        Arrays.sort(arr);

        for(int i=arr.length-1;i>=0;i--) {
            int num = Integer.parseInt(arr[i]);
            sum += num;
            result += arr[i];
        }
        
        if(!str.contains("0") || sum % 3 != 0) 
            bw.write("-1\n");
        else
            bw.write(result+"\n");

        br.close();
        bw.flush();
        bw.close();
    }
}

//내가 사용한 방법
// 입력값을 내림차순으로 정렬 후 30으로 나누어 떨어지면 성공

//그 외
// 0이 포함되고, 각 숫자의 합이 3의 배수이면 성공