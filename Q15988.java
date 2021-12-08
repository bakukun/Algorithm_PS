import java.io.*;

public class Q15988 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        long[] d = new long[1000001];
        d[1] = 1;
        d[2] = 2;
        d[3] = 4;
        for(int i = 4 ; i<= 1000000; i++){
            d[i] = (d[i-1]+d[i-2]+d[i-3])%1000000009;
        }

        for(int i = 0 ; i < n; i++){
            int a = Integer.parseInt(bf.readLine());
            bw.write(String.valueOf(d[a]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
