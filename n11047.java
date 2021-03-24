import java.util.Scanner;

public class n11047 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int total=sc.nextInt();
		int result=0;
		int[] unit=new int[num];
		for(int i=0;i<unit.length;i++) {
			unit[i]=sc.nextInt();
		}
		for(int i=unit.length-1;i>=0;i--) {
			
			result+=total/unit[i];
			total=total%unit[i];
			if(total==0)
				break;
			
		}
		System.out.println(result);

	}

}
