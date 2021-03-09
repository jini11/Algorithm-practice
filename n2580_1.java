import java.util.Scanner;

public class n2580_1 {
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
    public static void puzzle(int x,int y){
        if(x==9){
            return;
        }
        for(int i=0;i<9;i++){
            if(check(x,y)){
                arr[x][y]=i+1;
                puzzle(x+1,y+1);
            }
        }
    }
    public static boolean check(int x,int y){
        for(int i=0;i<10;i++){
            check_row[arr[x][i]]=true;
            check_col[arr[i][y]]=true;
        }
    }
}
