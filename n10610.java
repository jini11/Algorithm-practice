import java.io.*;
import java.util.*;

public class n10610 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long result = 0;
        String n = br.readLine();
        String[] arr = n.split("");

        int[] num = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(num);

        int sum = 0;
        for(int i=0;i<num.length;i++) {
            sum += num[i];
            long temp = (long) (num[i] * Math.pow(10, i));
            result += temp;
        }

        if(sum%3==0&&n.contains("0"))
            bw.write(result+"\n");
        else
            bw.write("-1\n");
        
        br.close();
        bw.flush();
        bw.close();
    }
}

//내가 사용한 방법
// 입력값을 내림차순으로 정렬 후 30으로 나누어 떨어지면 성공

//그 외
// 0이 포함되고, 각 숫자의 합이 3의 배수이면 성공