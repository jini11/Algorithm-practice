import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class n17219 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,String> map=new HashMap<>();
        
        String input=br.readLine();
        int cycle=Integer.parseInt(input.split(" ")[0]);
        int search=Integer.parseInt(input.split(" ")[1]);

        for(int i=0;i<cycle;i++){
            String in=br.readLine();
            String site=in.split(" ")[0];
            String password=in.split(" ")[1];

            map.put(site, password);
        }

        for(int i=0;i<search;i++){
            String site_name=br.readLine();

            System.out.println(map.get(site_name));
        }
    }
}
