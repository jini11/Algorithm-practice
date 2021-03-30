import java.util.Scanner;

public class n9375 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int n=sc.nextInt();
            String[][] closet=new String[n][2];
            int count=0;

            for(int j=0;j<n;j++){
                closet[j][0]=sc.next();
                closet[j][1]=sc.next();
            }
            for(int j=0;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(!closet[j][1].equals(closet[k][1])){
                        count++;
                    }
                }
            }
            System.out.println(n+count);
        }
    }
}
