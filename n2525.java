import java.util.Scanner;

public class n2525 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int cook = sc.nextInt();

        while(cook > 0) {
            if(cook + min < 60) {
                min = cook + min;
                cook = 0;
            } else if(cook + min == 60) {
                min = 0;
                hour += 1;
                cook = 0;
            } else {
                hour += 1;
                cook = cook - (60 - min);
                min = 0;
            }
            if(hour == 24) hour = 0;
        }
        System.out.println(hour + " " + min);
    }
}
