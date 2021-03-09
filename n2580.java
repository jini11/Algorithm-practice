import java.util.Scanner;

public class n2580 {
    static int[][] arr=new int[9][9];
    static boolean check_row[]=new boolean[10]; //가로
    static boolean check_col[]=new boolean[10]; //세로
    static boolean check_square[]=new boolean[10]; //3*3;
    static int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println();

        puzzle(0,0);

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        

    }
    public static void puzzle(int x,int j){

        if(x==9){
            puzzle(x+1,0);
            return;
        }         

        for(j=0;j<9;j++){
            if(arr[x][j]==0){
                for(int k=0;k<9;k++){//가로 세로
                    check_row[arr[k][j]]=true;
                    check_col[arr[x][k]]=true;
                
                }
               
                for(int m=(x/3)*3;m<(x/3)*3+3;m++){
                    for(int n=(j/3)*3;n<(j/3)*3+3;n++){//3*3
                        check_square[arr[m][n]]=true;
                        
                    }
                }
               
                for(int k=0;k<10;k++){//다 false면 0대신 인덱스 넣어주기
                    if(check_row[k]==false && check_col[k]==false && check_square[k]==false){
                        arr[x][j]=k;
                        //puzzle(x,j);
                       // arr[x][j]=0;
                    }
                    
                }
                
               // puzzle(x,j+1);

                for(int k=0;k<10;k++){
                    check_row[k]=false;
                    check_col[k]=false;
                    check_square[k]=false;

                }
                //puzzle(x+1,j);
                
            }
            count++;
            
        }

    }
}
