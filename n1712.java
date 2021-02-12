import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n1712 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String input=br.readLine();
        long fixedcost=Integer.parseInt(input.split(" ")[0]);
        long variouscost=Integer.parseInt(input.split(" ")[1]);
        long num=Integer.parseInt(input.split(" ")[2]);
        
        if(num<=variouscost)
            System.out.println("-1");
            else
            System.out.println(fixedcost/(num-variouscost)+1);


    }
}
