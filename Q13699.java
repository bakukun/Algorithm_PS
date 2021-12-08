import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q13699 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        long[] d = new long[n + 1];
        long sum = 0;
        d[0] = 1;
        for(int i = 1; i<= n; i++){
            for(int j = 0; j < i; j++){
                sum += d[j]*d[i-j-1];
            }
            d[i] = sum;
            sum = 0;
        }
        System.out.println(d[n]);
    }
}
