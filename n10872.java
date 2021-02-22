import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n10872 {
    
    public static void main(String[] args) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int sum = factorial(N);
		System.out.println(sum);
		
	}
	
	public static int factorial(int N) {
		if(N <= 1) return 1;	
		return N * factorial(N - 1);		
	}
    
}
