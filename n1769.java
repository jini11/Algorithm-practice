import java.util.Scanner;

public class n1769 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String n = sc.next();
        String answer = "";
        int cnt = 0;
        
        while(true) {
            int sum = 0;

            if(n.length() == 1) break;

            for(int i=0;i<n.length();i++) {
                sum += Integer.parseInt(String.valueOf(n.charAt(i)));
            }

            n = String.valueOf(sum);
            cnt++;
        }
        if(Integer.parseInt(n)%3==0) answer = "YES";
        else answer = "NO";

        System.out.println(cnt);
        System.out.println(answer);
    }
}
