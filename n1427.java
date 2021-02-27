import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class n1427 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String n=br.readLine();
        int[] arr=new int[n.length()];
        for(int i=0;i<arr.length;i++)
         arr[i]=Integer.parseInt(n.split("")[i]);

         Arrays.sort(arr);
         for(int i=arr.length-1;i>=0;i--)
            System.out.print(arr[i]);
    }
}
