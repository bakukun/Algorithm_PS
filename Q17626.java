import java.io.*;
import java.util.Arrays;

public class Q17626 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int[] d = new int[50001];
        for(int i = 1 ; i<= n; i++){
            d[i] = i;
        }
        for(int i =1; i <= n ; i++){
            for(int j = 1; j*j<= i; j++ ){
                d[i] = Math.min(d[i-(j*j)]+1,d[i]);
            }
        }
        bw.write(Integer.toString(d[n]));
        bw.flush();
        bw.close();
    }
}
