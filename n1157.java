import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
public class n1157 {
    public static void main(String[] args) throws Exception{
        //Scanner sc=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        s=s.toUpperCase();
        String[] arr=new String[s.length()];
        int[] count=new int[s.length()];
        //받은 문자열 분리해서 배열에 넣기, 대문자로 바꾸기
        for(int i=0;i<s.length();i++){
           arr[i]=s.split("")[i];
        }
        //배열에 있는 알파벳 비교, 같은 알파벳 나오면 count 증가
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]!=""&&arr[i].equals(arr[j])){
                    count[i]++;
                    arr[j]="";
                }
            }
            
        }
        for(int i=0;i<count.length;i++){
            for(int j=i+1;j<count.length;j++){
                if(count[i]<count[j]){
                    int temp=count[i];
                    count[i]=count[j];
                    count[j]=temp;

                    String p=arr[i];
                    arr[i]=arr[j];
                    arr[j]=p;

                    
                }
            }
           
        }
   
       if(arr.length==1)
            System.out.println(arr[0]);
        else{
       if(count[0]==count[1])  
           System.out.println("?");
        else
             System.out.println(arr[0]);

        }
       
    }
}
