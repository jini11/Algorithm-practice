import java.util.Scanner;

public class n1032 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.next();
        
        boolean same = true;
        for(int i=0;i<arr[0].length();i++) {
            char c = arr[0].charAt(i);
            same = true;

            for(int j=1;j<n;j++) {
                if(c != arr[j].charAt(i)) {
                    same = false;
                    break;
                }
            }
            if(same == true)
                System.out.print(c);
            else
                System.out.print("?");
        }
    }
}
