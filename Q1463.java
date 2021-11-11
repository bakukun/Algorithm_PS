import java.io.*;
import java.util.StringTokenizer;

public class Q1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x = Integer.parseInt(bf.readLine());
        int[] d = new int[1000001];
        for(int i = 2; i <= x ; i++){
            d[i] = d[i-1] + 1;
            if(i%2 ==0){
                d[i] = Math.min(d[i], d[i/2]+1);
            }
            if(i%3 ==0){
                d[i] = Math.min(d[i], d[i/3]+1);
            }
        }
        bw.write(Integer.toString(d[x]));
        bw.flush();
        bw.close();
    }
}
