import java.io.BufferedReader;
import java.io.InputStreamReader;


public class n1541 {
    public static int result=0;
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr=br.readLine().split("-");
       
    

        for(int i=0;i<arr.length;i++){
            int temp=0;
            if(arr[i].contains("+")){
                String[] plus=new String[arr[i].length()];
                plus=arr[i].split("\\+");
                for(int j=0;j<plus.length;j++)
                    temp+=Integer.parseInt(plus[j]);
                    arr[i]=Integer.toString(temp);
                    
            }
         
        }
        for(int i=0;i<arr.length-1;i++){
            arr[i+1]=Integer.toString(Integer.parseInt(arr[i])-Integer.parseInt(arr[i+1]));
        }

        System.out.println(Integer.parseInt(arr[arr.length-1]));
       
        
    }
}

/*
55-50+40 ->str
44-56+34-43
44 - 56+34 - 43
44 - 90 - 43

result=result-44
*/
