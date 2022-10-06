import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class n2529 {
    static ArrayList<String> list = new ArrayList<>();
    static int k;
    static char[] arr;
    static boolean[] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        k = Integer.parseInt(br.readLine());
        arr = new char[k];
        visited = new boolean[10];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<k;i++)
            arr[i] = st.nextToken().charAt(0);

        dfs(0, "");

        Collections.sort(list);
        System.out.println(list.get(list.size()-1));
        System.out.println(list.get(0));
    }
    public static void dfs(int depth, String s) {
        if(depth == k+1) {
            list.add(s);
            return;
        }

        for(int i=0;i<10;i++) {
            if(!visited[i]) {
                if(depth == 0 || chkNum(s.charAt(depth-1) - '0', i, arr[depth-1])) {
                    visited[i] = true;
                    dfs(depth+1, s + Integer.toString(i));
                    visited[i] = false;
                }
            }
        }
    }
    public static boolean chkNum(int a, int b, char c) {
        if(c == '<')
            return a < b;
        else 
            return b < a;
    }
}
