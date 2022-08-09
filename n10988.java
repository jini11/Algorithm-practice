import java.util.Scanner;

public class n10988 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(s);
		String reverse = sb.reverse().toString(); // 문자열 뒤집기
		
		if(s.equals(reverse)) // 팰린드롬이면
			System.out.println("1");
		else // 팰린드롬이 아니면
			System.out.println("0");
	}
}
