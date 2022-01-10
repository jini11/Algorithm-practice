import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n13305_2 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        long[] road = new long[n-1];
        long[] city = new long[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<road.length;i++)
            road[i] = Long.parseLong(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<city.length;i++)
            city[i] = Long.parseLong(st.nextToken());

        long[] city2 = Arrays.copyOfRange(city, 0, city.length-1);
        long min = Arrays.stream(city2).min().getAsLong();
        long sum = Arrays.stream(road).sum();
        long result = road[0] * city[0];
        sum -= road[0];
        
        for(int i=1;i<city.length;i++){
            if(city[i]==min) {
                result += sum * city[i];
                break;
            }
            else {
                result += road[i] * city[i];
                sum -= road[i];
            }
        }
        System.out.println(result);
    }
}
