import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class n1431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] serial = new String[n];
        for(int i=0;i<n;i++)
            serial[i] = br.readLine();
        Arrays.sort(serial, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) { // 2번 조건(합)
                    int sum1 = 0;
                    int sum2 = 0;
                    for(int i=0;i<o1.length();i++) {
                        if(o1.charAt(i) >= '0' && o1.charAt(i) <= '9')
                            sum1 += Integer.parseInt(String.valueOf(o1.charAt(i)));
                    }
                    for(int i=0;i<o2.length();i++) {
                        if(o2.charAt(i) >= '0' && o2.charAt(i) <= '9')
                            sum2 += Integer.parseInt(String.valueOf(o2.charAt(i)));
                    }
                    if(sum1 == sum2) { // 3번 조건(사전순)
                        return o1.compareTo(o2);
                    } else { // 2번 조건(합)
                        return sum1 - sum2;
                    }

                } else { // 1번 조건(길이)
                    return o1.length() - o2.length(); // 오름차순
                }
            }
            
        });

        for(int i=0;i<n;i++)
            System.out.println(serial[i]);
    }
}
