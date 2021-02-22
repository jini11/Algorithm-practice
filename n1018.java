import java.util.Scanner;

public class n1018 {
    static char[][] arr;
    static char[] black={'B','W','B','W','B','W','B','W'};
    static char[] white={'W','B','W','B','W','B','W','B'};
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int m=sc.nextInt();

        arr=new char[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.next().charAt(0);
                System.out.print(arr[i][j]+" ");
            }
        }
        

        int min=64;
        
        for(int i=0;i<n-7;i++){
            for(int j=0;j<m-7;j++){
                min=chess(i,j);
            }
        }
        System.out.println(min);
        
    }
    public static int chess(int row,int col){//
        int count=0;
        int min=64;
        for(int i=0;i<row+8;i++){
            for(int j=0;j<col+7;j++){
                if(arr[row][col]=='W'){
                    if(arr[i][j]!=white[j]){
                        count++;
                        arr[i][j]=white[j+1];
                    }
                }
                else{
                    if(arr[i][j]!=black[j]){
                        count++;
                        arr[i][j]=black[j+1];
                    }
                }
            }
            if(min>count)
                min=count;
        }
        return min;
    }
}
