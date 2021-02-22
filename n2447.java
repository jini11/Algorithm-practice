import java.util.Scanner;

public class n2447 {
    static String[][] arr;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StringBuffer sb=new StringBuffer();
        int n=sc.nextInt();
        arr=new String[n][n];
       
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=" ";
            }
        }
        printstar(0,0,n);

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }
    public static void printstar(int x,int y,int n){
        if(n==1){
            arr[x][y]="*";
            return;
        }
        n/=3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==1&&j==1){
                    continue;
                }
                printstar(x+(i*n),y+(j*n),n);
            }
        }
    }
}
