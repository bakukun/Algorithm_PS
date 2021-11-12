import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Q11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(bf.readLine());
        Long[] d = new Long[1001];
        d[1] = 1l;
        d[2] = 2l;
        if(a>=3) {
            for (int i =3; i<=a;i++){
                d[i] = (d[i-1]+d[i-2])%10007;
            }
        }
        bw.write(Long.toString(d[a]));
        bw.flush();
        bw.close();
    }
}
