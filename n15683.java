import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class n15683 {
    static int n, m;
    static int[][] map;
    static int[][] copyMap;
    static ArrayList<int[]> cctvList = new ArrayList<>();
    static int[] dx = {-1, 0, 1, 0}; // 상 우 하 좌
    static int[] dy = {0, 1, 0, -1};
    static int min = Integer.MAX_VALUE;
    static int[] dir;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        map = new int[n][m];

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                map[i][j] = sc.nextInt();
                if(map[i][j] != 0) {
                    cctvList.add(new int[] {i, j});
                }
            }
        }

        dir = new int[cctvList.size()];
        checkCases(0, cctvList);
        System.out.println(min);
    }

    public static void checkCases(int depth, ArrayList<int[]> cctvList) { //조합    여기가 제일 어려워..
        if(depth == cctvList.size()) { // 다 뽑으면
            // copymap
            copyMap = new int[n][m];
            copyMap = map.clone();
            
            // checkDirection
            for(int i=0;i<cctvList.size();i++) {
                int[] tmp = cctvList.get(i);
                checkDirection(tmp[0], tmp[1], dir[i], map);
            }
            //getArea
            getArea(copyMap);

            return;
        }
        
        for(int i=0;i<4;i++) {
            dir[depth] = i; // 이건 왜 쓰는 걸까?
            checkCases(depth+1, cctvList);
        }
    }

    public static void checkDirection(int x, int y, int d, int[][] map) { // 방향 정하기 //d:0,1,2,3
        int cctvNum = map[x][y];

        switch(cctvNum) {
            case 1:
                if(d == 0) 
                    watch(x, y, 0);
                else if(d == 1)
                    watch(x, y, 1);
                else if(d == 2)
                    watch(x, y, 2);
                else if(d == 3)
                    watch(x, y, 3);
                break;
            case 2:
                if(d == 0 || d == 2) {
                    watch(x, y, 0);
                    watch(x, y, 2);
                } else if(d == 1 || d == 3) {
                    watch(x, y, 1);
                    watch(x, y, 3);
                }
                break;
            case 3:
                if(d == 0) {
                    watch(x, y, 0);
                    watch(x, y, 1);
                }
                else if(d == 1) {
                    watch(x, y, 1);
                    watch(x, y, 2);
                }
                else if(d == 2) {
                    watch(x, y, 2);
                    watch(x, y, 3);
                }
                else if(d == 3) {
                    watch(x, y, 3);
                    watch(x, y, 0);
                }
                break;
            case 4:
                if(d == 0) {
                    watch(x, y, 0);
                    watch(x, y, 1);
                    watch(x, y, 2);
                }
                else if(d == 1) {
                    watch(x, y, 1);
                    watch(x, y, 2);
                    watch(x, y, 3);
                }
                else if(d == 2) {
                    watch(x, y, 2);
                    watch(x, y, 3);
                    watch(x, y, 0);
                }
                else if(d == 3) {
                    watch(x, y, 3);
                    watch(x, y, 0);
                    watch(x, y, 1);
                }
                break;
            case 5:
                watch(x, y, 0);
                watch(x, y, 1);
                watch(x, y, 2);
                watch(x, y, 3);
                break;
                
        }
    }
    
    public static void watch(int x, int y, int d) { // cctv 방향에 따라 감시
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];

        queue.add(new int[] {x, y});
        visited[x][y] = true;

        while(!queue.isEmpty()) {
            int[] point = queue.poll();
            int nx = point[0] + dx[d];
            int ny = point[1] + dy[d];

            if(nx < 0 || ny < 0 || nx >= n || ny >= m || copyMap[nx][ny] == 6) //벽, 끝까지 도달했을 경우
                break;
        
            if(!visited[nx][ny] && copyMap[nx][ny] == 0) { // 0일 경우
                copyMap[nx][ny] = -1;
                visited[nx][ny] = true;
                queue.add(new int[] {nx, ny});
            } else {
                queue.add(new int[] {nx, ny});
            }
        }
    }

    public static void getArea(int[][] map) { // 사각지대 탐색
        int zero = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(map[i][j] == 0) zero++;
            }
        }
        min = Math.min(min, zero);
    }
}
