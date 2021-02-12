import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n1316 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

       int num=Integer.parseInt(br.readLine());
        String[] word=new String[num];
       boolean check=false;
       boolean c=true;
        int count=0;
        for(int i=0;i<word.length;i++)
            word[i]=br.readLine();
        
        for(int i=0;i<num;i++){
            for(int j=0;j<word[i].length()-1;j++){
                for(int m=j+1;m<word[i].length();m++){
                    if(word[i].charAt(j)==(word[i].charAt(m))){
                        for(int k=j;k<=m;k++){
                            if(word[i].charAt(k)==word[i].charAt(j))
                                check=true;
                             else
                                c=false;
                        }
                    }
                }
            }
            if(check==true&&c==true)
                count++;
            if(word[i].length()==1)
                count++;
        }

        

        
      
       System.out.println(count);

    }
}
