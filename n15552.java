import java.io.BufferedReader;
import java.io.*;
import java.util.*;

public class n15552 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        
        int chance=Integer.parseInt(br.readLine());
        int[] num=new int[2];
       
        StringTokenizer st;

        for(int i=0;i<chance;i++){
            st=new StringTokenizer(br.readLine());
            num[0]=Integer.parseInt(st.nextToken());
            num[1]=Integer.parseInt(st.nextToken());
            bw.write((num[0]+num[1])+"\n");
        }
        bw.flush();
        br.close();
        bw.close();
        
        
    }
}
