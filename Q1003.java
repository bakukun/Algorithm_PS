import java.io.*;

public class Q1003 {
    static int zero;
    static int one;
    static int zero_plus_one;
    public static void fi(int n) {
        zero = 1;
        one = 0;
        zero_plus_one = 1;

        for (int i = 0; i < n; i++) {
            zero = one;
            one = zero_plus_one;
            zero_plus_one = zero + one;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(bf.readLine());
            fi(a);
            bw.write(Integer.toString(zero));
            bw.write(" ");
            bw.write(Integer.toString(one));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
