import java.util.Scanner;

public class n14501 {
    static int n, money, count, final_money;
    static int[][] table;
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        table = new int[n][2];
        for(int i=0;i<n;i++) {
            table[i][0] = sc.nextInt();
            table[i][1] = sc.nextInt();
        }
        int max = 0;
        for(int i=0;i<n;i++) {
            count = 0;
            money = 0;
            get_cost(i);
            if(count>=max) {
                max = count;
                final_money = money;
            }
        }
        System.out.println(final_money);
    }
    public static void get_cost(int day) {
        if(day>=n) return;
        money += table[day][1];
        //System.out.println(money);
        get_cost(day+table[day][0]);
        count++;
    }
}
