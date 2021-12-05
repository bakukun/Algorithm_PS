import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q14495 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        long[] d = new long[117];
        d[1] = 1;
        d[2] = 1;
        d[3] = 1;
        for(int i =4; i<=n; i++){
            d[i]=d[i-1]+d[i-3];
        }
        System.out.println(d[n]);
    }
}
