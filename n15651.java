import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n15651 {

    static int[] result;
    static boolean[] key;
    public static StringBuilder sb=new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        String s=br.readLine();
        int n = Integer.parseInt(s.split(" ")[0]);
        int m = Integer.parseInt(s.split(" ")[1]);

        result = new int[m];
        key=new boolean[n];

        dfs(n,m,0);
        System.out.print(sb);
    }  
    public static void dfs(int n,int m,int count){
        
        if(count==m){
            for(int i=0;i<m;i++){
                sb.append(result[i]+" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=0;i<n;i++){
            
                key[i]=true;
                result[count]=i+1;
                dfs(n,m,count+1);
                key[i]=false;
            
            
        }
        
    }
}
