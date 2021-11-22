import java.io.*;
import java.math.BigInteger;

public class Q2338 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BigInteger a = new BigInteger(bf.readLine());
        BigInteger b = new BigInteger(bf.readLine());
        bw.write(String.valueOf(a.add(b)));
        bw.newLine();
        bw.write(String.valueOf(a.subtract(b)));
        bw.newLine();
        bw.write(String.valueOf(a.multiply(b)));
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
