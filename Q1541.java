import java.io.*;
import java.util.StringTokenizer;

public class Q1541 {
    public static void main(String[] args) throws IOException {
        int sum = Integer.MAX_VALUE;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine(),"-");

        while(st.hasMoreTokens()){
            int tmp = 0;
            StringTokenizer add = new StringTokenizer(st.nextToken(),"+");

            while(add.hasMoreTokens()){
                tmp += Integer.parseInt(add.nextToken());
            }

            if(sum == Integer.MAX_VALUE){
                sum = tmp;
            } else{
                sum-=tmp;
            }
        }
        bw.write(Integer.toString(sum));
        bw.flush();
        bw.close();
    }
}
