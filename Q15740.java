import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Q15740 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        BigInteger a = new BigInteger(st.nextToken());
        BigInteger b = new BigInteger(st.nextToken());
        bw.write(String.valueOf(a.add(b)));
        bw.flush();
        bw.close();
    }
}
