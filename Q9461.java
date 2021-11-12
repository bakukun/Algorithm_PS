import java.io.*;

public class Q9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(bf.readLine());
        Long[] d = new Long[101];
        d[1] = 1l;
        d[2] = 1l;
        d[3] = 1l;
        for(int i=4; i<=100;i++){
            d[i] = d[i-3]+d[i-2];
        }
        for(int i =0; i<a;i++){
            int n = Integer.parseInt(bf.readLine());
            bw.write(Long.toString(d[n]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
