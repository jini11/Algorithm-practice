public class n4673 {
    static boolean[] result = new boolean[10000];

    public static void main(String[] args) {
        get_selfnum();

    }

    //1부터  1000까지 각 자리수를 더한 값에 위치한 result를 true로 변경하기-by 지은
    public static void get_selfnum() {
        for(int i=1;i<10000;i++){
            int sum=i;
            sum+=i/1000;
            sum+=(i%1000)/100;
            sum+=(i%1000)%100/10;
            sum+=(i%1000)%100%10;

            if(sum<10001)
            result[sum]=true;

        }
    }
}
