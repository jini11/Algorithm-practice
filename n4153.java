import java.util.Scanner;

public class n4153 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int[] arr=new int[3];
     
        while(true){
            for(int i=0;i<3;i++)
                arr[i]=sc.nextInt();

            if(arr[0]==0&&arr[1]==0&&arr[2]==0) break;

            for(int i=0;i<3;i++){
                for(int j=i+1;j<3;j++){
                    if(arr[i]<arr[j]){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            if(Math.pow(arr[0], 2)==Math.pow(arr[1], 2)+Math.pow(arr[2], 2))
                System.out.println("right");
            else
                System.out.println("wrong");

        }
    }
    
}
