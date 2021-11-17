import java.io.*;
import java.math.BigInteger;

public class Q9659 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BigInteger n = new BigInteger(bf.readLine());
        BigInteger two = new BigInteger("2");
        if (n.mod(two).equals(BigInteger.ONE)) {
            bw.write("SK");
        } else {
            bw.write("CY");
        }
        bw.flush();
        bw.close();
    }
}
