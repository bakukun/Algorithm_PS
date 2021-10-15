import java.io.*;
import java.util.Arrays;

public class Q1076 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        long[] num = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
        int cnt = 0;
        long mul = 0;
        String str = br.readLine();
        cnt += Arrays.asList(color).indexOf(str)*10;
        str = br.readLine();
        cnt += Arrays.asList(color).indexOf(str);
        str = br.readLine();
        mul = num[Arrays.asList(color).indexOf(str)];
        mul *= cnt;
        bw.write(Long.toString(mul));
        bw.flush();
        bw.close();
    }
}
