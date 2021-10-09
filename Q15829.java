import java.io.*;

public class Q15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        long sum = 0;
        long pow = 1;
        String str = bf.readLine();
        for (int i = 0; i < n; i++) {
            sum += ((str.charAt(i) - 96) * pow);
            pow = (31 * pow) % 1234567891;
        }
        bw.write(String.valueOf(sum%1234567891));
		bw.flush();
		bw.close();
    }
}
