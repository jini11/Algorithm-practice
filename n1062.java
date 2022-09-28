import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n1062 {
    static int result = 0, n, k;
    static String[] word;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        word = new String[n];
        visited = new boolean[26];

        for(int i=0;i<n;i++) {
            word[i] = br.readLine();
            word[i] = word[i].replaceAll("anta||tica", "");
        }

        if(k < 5) { // k <= 5 써서 틀림...
            System.out.println(0);
            return;
        } else if(k == 26) {
            System.out.println(n);
            return;
        }

        visited['a' - 'a'] = true;
        visited['n' - 'a'] = true;
        visited['t' - 'a'] = true;
        visited['i' - 'a'] = true;
        visited['c' - 'a'] = true;

        dfs(0, 0);
        System.out.println(result);
    }
    public static void dfs(int start, int cnt) {
        if(cnt == k-5) {
            int tmp = 0;
            for(int i=0;i<word.length;i++) {
                boolean chk = true;
                for(int j=0;j<word[i].length();j++) {
                    if(!visited[word[i].charAt(j) - 'a']) 
                        chk = false;
                }
                if(chk) tmp++;
            }
            result = Math.max(result, tmp);
            return;
        }

        for(int i=start;i<26;i++) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(i, cnt+1);
                visited[i] = false;
            }
        }
    }
}
