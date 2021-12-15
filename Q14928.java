import java.io.*;
import java.math.BigInteger;

public class Q14928 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = bf.readLine();
        long temp = 0;
        for (int i = 0; i < input.length(); i++) {
            temp = (temp * 10 + (input.charAt(i) - '0')) % 20000303;
        }
        bw.write(String.valueOf(temp));
        bw.flush();
        bw.close();
    }
}
