import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class n1339 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] str = new String[n];
        int max = 0;
        int result = 0;
        for(int i=0;i<n;i++) {
            str[i] = br.readLine();
            if(max < str[i].length())
                max = str[i].length();
        }

        //길이 통일
        for(int i=0;i<n;i++) {
            if(str[i].length() < max) {
                String s = " ";
                str[i] = s.repeat(max - str[i].length()) + str[i].substring(0, str[i].length());
            }
        }

        // 배열에 알파벳 번갈아 넣기
        List<String> list = new ArrayList<>();
        int k = 0;
        for(int i=0;i<max;i++) {
            for(int j=0;j<n;j++) {
                list.add(str[j].split("")[i]); 
            }
        }  

        list.remove(" ");
        
        int[] num = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        for(int i=0;i<n;i++) {
            String temp = "";
            for(int j=0;j<list.size();j++) {
                if(str[i].contains(list.get(j))) {
                   // str[i] = str[i].replace(list.get(j), Integer.toString(num[j]));
                    temp += Integer.toString(num[j]);
                }
            }
            result += Integer.parseInt(temp);
        }

        System.out.println(result);
    }
}
