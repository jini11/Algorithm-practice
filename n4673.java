public class n4673 {
    static boolean[] result = new boolean[10000];

    public static void main(String[] args) {
        get_selfnum();
    }

    public static void get_selfnum() {

        for (int i = 1; i < 10000; i++) {
            if(i<100){
            int a = i / 10;
            int b = i % 10;
            result[i+a+b]=true;
            }
            if(i>99&&i<1000){
                int a=i/100;
                int b=(i%100)/10;
                int c=(i%100)%10;
                result[i+a+b+c]=true;
            }
            if(i>999&&i<10000){
                int a=i/1000;
                int b=(i%1000)/100;
                int c=(i%100)/10;
                int d=(i%100)%10;
                result[i+a+b+c+d]=true;
            }
           
        }
        for(int i=1;i<10000;i++){
            if(result[i]==false)
            System.out.println(i);
        }
    }
    
}
