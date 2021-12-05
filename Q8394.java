import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q8394 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        long[] d = new long[10000001];
        d[1] = 1;
        d[2] = 2;
        for(int i =3; i<=n; i++){
            d[i]=(d[i-1]+d[i-2])%10;
        }
        System.out.println(d[n]);
    }
}
