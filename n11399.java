import java.util.Arrays;
import java.util.Scanner;

public class n11399 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		Arrays.sort(arr);
		//1 2 3 3 4
		int total=0;
		int sum=0;
		for(int i=0;i<n;i++) {
			total+=arr[i];
			sum+=total;
		}
		System.out.println(sum);
	}

}
