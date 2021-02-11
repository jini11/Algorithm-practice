import java.util.*;
public class n10809 {
 
     static String[] alpha = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
    "s", "t", "u", "v", "w", "x", "y", "z" };
    
    static int[] result=new int[alpha.length];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();//문자열 입력
        String[] arr = new String[s.length()];

        // 문자열을 분리해 배열에 넣음. by jieun
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.split("")[i];
            
        }

        //결과를 출력하는 배열의 값들을 -1로 초기화 by jieun
        for(int i=0;i<result.length;i++)
            result[i]=-1;
        
        //문자열에 있는 단어가 있으면 알파벳 배열을 자릿수로 대신 채워넣기
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < alpha.length; j++) {
                if(arr[i].equals(alpha[j])){
                   result[j]=i;
                   alpha[j]="";// baekjoon을 입력했을 때 o를 한 번만 카운트하기 위함.
                }                
            }
        }
      for(int i=0;i<result.length;i++)
         System.out.print(result[i]+" ");

    }
}
