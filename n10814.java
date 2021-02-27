import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class n10814 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String[][] arr=new String[n][2];
        for(int i=0;i<n;i++){
            String s=br.readLine();
            arr[i][0]=s.split(" ")[0];
            arr[i][1]=s.split(" ")[1];
        }
        
        Arrays.sort(arr,new Comparator<String[]>(){
            public int compare(String[] s1,String[] s2){
                return Integer.parseInt(s1[0])-Integer.parseInt(s2[0]);
            }      
        });
        
        for(int i=0;i<n;i++)
            System.out.println(arr[i][0]+" "+arr[i][1]);
        
    }
}
