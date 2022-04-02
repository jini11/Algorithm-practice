import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class n15685 { // 다시 풀어볼 것
    static boolean[][] map;
    static int n, count;
    static int[] dx = {1, 0, -1, 0}; // 0: 우, 1: 상, 2: 좌, 3: 하
    static int[] dy = {0, -1, 0, 1};
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new boolean[101][101];
        count = 0;

        for(int i=0;i<n;i++) {
            String input = br.readLine();
            int x = Integer.parseInt(input.split(" ")[0]);
            int y = Integer.parseInt(input.split(" ")[1]);
            int d = Integer.parseInt(input.split(" ")[2]); // 방향
            int g = Integer.parseInt(input.split(" ")[3]); // 세대

            // 드래곤 커브 표시
            dragon_curve(x, y, d, g);
        }
        // 정사각형 개수 세기
        for(int i=0;i<100;i++) 
            for(int j=0;j<100;j++) 
                if(map[i][j] && map[i+1][j] && map[i][j+1] && map[i+1][j+1])
                    count++;
        System.out.println(count);
    }
    public static void dragon_curve(int x, int y, int d, int g) {
        List<Integer> list = new ArrayList<>();
        list.add(d);
        map[y][x] = true;

        for(int i=0;i<g;i++) {
            for(int j=list.size()-1;j>=0;j--)
                list.add((list.get(j)+1) % 4);
        }

        for(Integer dir:list) {
            x += dx[dir];
            y += dy[dir];
            map[y][x] = true;
        }
    }
}
