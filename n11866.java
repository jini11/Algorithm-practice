import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class n11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
		
		for (int i = 1; i <= n; i++) {
			q.offer(i);
		}

		int cnt = 0;
		String ans = "<";
		while (!q.isEmpty()) {
			cnt++;
			if(cnt == k) {
				ans += q.poll()+", ";
				cnt = 0;
			}else {
				q.offer(q.poll());
			}
		}
		ans = ans.substring(0,ans.length()-2);
		ans += ">";
		
		System.out.println(ans);
    }
}
