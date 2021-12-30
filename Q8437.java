import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Q8437 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BigInteger a = new BigInteger(bf.readLine());
        BigInteger b = new BigInteger(bf.readLine());
        BigInteger tmp_a = a.subtract(b).divide(BigInteger.TWO);
        System.out.println(tmp_a.add(b));
        System.out.println(tmp_a);
    }
}