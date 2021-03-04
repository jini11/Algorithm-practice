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
        
        if(count==m){//m만큼 출력했다면
            for(int i=0;i<m;i++){
                System.out.print(result[i]+" ");
            }
            System.out.println();
            return;
        }
        //그렇지 않다면
        for(int i=0;i<n;i++){
            if(key[i])//key배열이 true이면 패스
                continue;
            else{// 아닐경우,
                key[i]=true; // 1~4 중 사용한 거 true
                result[count]=i+1;//1~4 중 하나가 result배열에 넣기
                dfs(n,m,count+1);//재귀
                key[i]=false;// key 원상복귀
            }
            
        }
        
    }
}
