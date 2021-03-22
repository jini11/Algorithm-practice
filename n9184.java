import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class n9184 {
    public static int[][][] arr=new int[21][21][21];

    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int a = 0;
        int b = 0;
        int c = 0;

        while(a!=-1 || b!=-1 || c!=-1){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            int w = W(a, b, c);
            if(!(a==-1 && b==-1 && c==-1))
            System.out.println("w(" + a + ", " + b + ", " + c + ") = " + w);
        }
    }

    public static int W(int a, int b, int c) {

        if (a <= 0 || b <= 0 || c <= 0) {
            return 1;
        } 
        if (a > 20 || b > 20 || c > 20) {
            return arr[20][20][20]=W(20, 20, 20);

        }
        if(arr[a][b][c]!=0){ //이거 때문에 시간초과
            return arr[a][b][c];
        } 
        if (a < b && b < c) {
            return arr[a][b][c]=(W(a, b, c - 1) + W(a, b - 1, c - 1) - W(a, b - 1, c));
        }

        return arr[a][b][c]=(W(a - 1, b, c) + W(a - 1, b - 1, c) + W(a - 1, b, c - 1) - W(a - 1, b - 1, c - 1));
        
    }
}
