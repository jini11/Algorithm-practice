import java.util.ArrayList;
import java.util.Scanner;

public class n2210 {
    static int[][] arr;
    static ArrayList<String> list; // 중복 제거
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        arr = new int[5][5];
        list = new ArrayList<>();

        for(int i=0;i<5;i++)
            for(int j=0;j<5;j++)
                arr[i][j] = sc.nextInt();
        
        for(int i=0;i<5;i++)
            for(int j=0;j<5;j++)
                dfs(i, j, 1, ""+arr[i][j]);
            
        System.out.println(list.size());
    }
    public static void dfs(int x, int y, int num, String str) {
        if(num>=6) {
            if(!list.contains(str))
                list.add(str);
            return;
        }
        for(int i=0;i<4;i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>-1 && ny>-1 && nx<5 && ny<5)
                dfs(nx, ny, num+1, str+arr[nx][ny]);
        }
        
        
    }
}
