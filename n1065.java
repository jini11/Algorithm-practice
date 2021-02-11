
import java.util.Scanner;
public class n1065 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count= get_hannum(n);
        System.out.println(count);
    }

    public static int get_hannum(int n) {
        int count=0;

         if(n>999){
            n=999;
        }

        if(n<100){
            count=n;
        }
        else if(n>99&&n<1000){//각 자리 수로 나눠서 한수 개수 판별
            for(int i=100;i<=n;i++){
            int a=i/100;
            int b=(i%100)/10;
            int c=(i%100)%10;

            if((a-b)==(b-c))//등차수열 판별
                count++;
            }
            count+=99;
        }
        return count;
    }
}

//1부터 99까지 입력한 수 반환
// 세 자리 수일 경우 각 자리를 분리해 등차수열인지 확인
