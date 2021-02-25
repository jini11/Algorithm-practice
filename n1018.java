import java.util.Scanner;

public class n1018 {
    static char[][] arr;
    static char[][] black={{'B','W','B','W','B','W','B','W'},
                            {'W','B','W','B','W','B','W','B'},
                            {'B','W','B','W','B','W','B','W'},
                            {'W','B','W','B','W','B','W','B'},
                            {'B','W','B','W','B','W','B','W'},
                            {'W','B','W','B','W','B','W','B'},
                            {'B','W','B','W','B','W','B','W'},
                            {'W','B','W','B','W','B','W','B'},
                            };
    static char[][] white={{'W','B','W','B','W','B','W','B'},
                            {'B','W','B','W','B','W','B','W'},
                            {'W','B','W','B','W','B','W','B'},
                            {'B','W','B','W','B','W','B','W'},
                            {'W','B','W','B','W','B','W','B'},
                            {'B','W','B','W','B','W','B','W'},
                            {'W','B','W','B','W','B','W','B'},
                            {'B','W','B','W','B','W','B','W'}
                        };

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int m=sc.nextInt();

        arr=new char[n][m];
        for(int i=0;i<n;i++){
            String str=sc.next();
            for(int j=0;j<m;j++){
                arr[i][j]=str.charAt(j);
               
            }
        }
        int min=64;
        
        for(int i=0;i<n-7;i++){
            for(int j=0;j<m-7;j++){
                int count=chess(i,j);
                if(min>count)
                    min=count;
            }
        }
        System.out.println(min);
        
    }

    public static int chess(int row,int col){
        int count=0;
        for(int i=row;i<row+8;i++){
            for(int j=col;j<col+8;j++){
                if(arr[row][col]=='W'){
                  if(arr[i][j]!=white[i-row][j-col])
                      count++;
                }
                else{
                    if(arr[i][j]!=black[i-row][j-col])
                        count++;
                }
            }
            
        }
        return count;
    }
}
