import java.io.*;

public class Q9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(bf.readLine());
        int[] d = new int[11];
        d[1] = 1;
        d[2] = 2;
        d[3] = 4;
        for(int j = 4 ; j <= 10; j++){
            d[j] = d[j-1]+d[j-2]+d[j-3];
        }
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(bf.readLine());
            bw.write(Integer.toString(d[n]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}

