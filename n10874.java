import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class n10874 {
    public static void main(String []args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] answer = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int[] arr;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++) {
            arr = new int[10];
            boolean chk = true;
            for(int j=0;j<10;j++) {
                arr[j] = sc.nextInt();
                if(answer[j] != arr[j]) {
                    chk = false;
                }
            }
            if(chk)
                list.add(i+1);
        }
        for(int i=0;i<list.size();i++)
            System.out.println(list.get(i));

    }
}