import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n1010 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        
        int T=Integer.parseInt(br.readLine());
        double[][] arr=new double[T][2];
        for(int i=0;i<T;i++){
            String str=br.readLine();
            arr[i][0]=Integer.parseInt(str.split(" ")[0]);
            arr[i][1]=Integer.parseInt(str.split(" ")[1]);
            System.out.printf("%.0f\n",bridge(arr[i][0],arr[i][1]));
        }

    }
    public static double bridge(double b, double a){
        double top=1;
        double bottom=1;
        for(double i=a;i>a-b;i--)
            top*=i;
        for(double i=b;i>0;i--)
            bottom*=i;

        return (top/bottom);
    }
}
