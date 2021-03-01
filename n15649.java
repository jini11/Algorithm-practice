import java.util.Scanner;

public class n15649 {

    static int[] result;
    static boolean[] key;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        result = new int[m];
        key=new boolean[n];

        dfs(n,m,0);
    }  
    public static void dfs(int n,int m,int count){
        
        if(count==m){
            for(int i=0;i<m;i++){
                System.out.print(result[i]+" ");
            }
            System.out.println();
            return;
        }

        for(int i=0;i<n;i++){
            if(key[i])
                continue;
            else{
                key[i]=true;
                result[count]=i+1;
                dfs(n,m,count+1);
                key[i]=false;
            }
            
        }
        
    }
}
