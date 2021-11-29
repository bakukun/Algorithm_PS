import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        long[] km = new long[n - 1];
        long[] price = new long[n];
        long sum = 0;
        long lowest = Integer.MAX_VALUE;
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        for(int i = 0; i< km.length; i++){
            km[i] = Long.parseLong(st.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(bf.readLine(), " ");
        for(int i = 0; i< price.length; i++) {
            price[i] = Long.parseLong(st2.nextToken());
        }

        for(int i = 0; i< price.length-1; i++) {
            if (price[i] < lowest) {
                lowest = price[i];
            }
            sum += (lowest *km[i]);
        }

        System.out.println(sum);
    }
}
