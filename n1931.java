import java.util.Arrays;
import java.util.Scanner;

public class n1931{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int com=sc.nextInt();
		int count=0;
		int[][] time=new int[com][2];
		
		for(int i=0;i<com;i++) {
			for(int j=0;j<2;j++)
				time[i][j]=sc.nextInt();
        }
		Arrays.sort(time, (a,b) -> a[1]==b[1]?a[0]-b[0]:a[1]-b[1]);
		
		int min=-1;
		
		for(int i=0;i<com;i++) {
			if(min<=time[i][0]) {
				
				min=time[i][1];
				count++;
			}
			
		}
		
		System.out.println(count);
	}

}
