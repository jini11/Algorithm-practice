import java.util.Scanner;

public class n11051 {
    public static int[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        arr = new int[a + 1][a + 1];
   
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<=i;j++){
                if(i==j || j==0)
                    arr[i][j]=1;
                else{
                    arr[i][j]=(arr[i-1][j-1]+arr[i-1][j])%10007;
                }
            }
        }
        System.out.println(arr[a][b]);
     
    }

    
}

/*
 * 
 * 1 1 1 1 2 1 1 3 3 1 1 4 6 4 1
 */
