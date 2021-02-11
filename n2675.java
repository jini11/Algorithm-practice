import java.util.*;
public class n2675 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int chance=sc.nextInt();
        String[] s=new String[chance];
        int[] n=new int[chance];
        for(int i=0;i<chance;i++){
            n[i]=sc.nextInt();
            s[i]=sc.next();
        }
        for(int i=0;i<chance;i++){
             for(int m=0;m<s[i].length();m++){
                 for(int l=0;l<n[i];l++)
                      System.out.print(s[i].split("")[m]);
            }
            System.out.println();
        }
    }
}
