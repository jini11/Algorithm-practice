import java.util.Arrays;
import java.util.Scanner;

public class n11650 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        }
       Arrays.sort(arr,(a,b)->{
        if(a[0]==b[0])
            return a[1]-b[1];
        else
            return a[0]-b[0];
       });

        for(int i=0;i<n;i++){
                System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}
