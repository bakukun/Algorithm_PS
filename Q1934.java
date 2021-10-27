import java.io.*;
import java.util.StringTokenizer;

public class Q1934 {
    public static int gcd(int A,int B){
        if(B==0){
            return A;
        }
        else{
            return gcd(B,A%B);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(bf.readLine());
        for (int i = 0; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (b > a) {
                int tmp = a;
                a = b;
                b = tmp;
            }
            int gcd = gcd(a, b);
            bw.write(Integer.toString(a * b / gcd));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
