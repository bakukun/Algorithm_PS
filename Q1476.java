import java.io.*;
import java.util.StringTokenizer;

public class Q1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int cnt = 1;
        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int e = 1 ;
        int s = 1 ;
        int m = 1 ;

        while(!(e == E && s == S && m == M)){
            e++;
            s++;
            m++;
            if(e>15){
                e = 1;
            }
            if(s>28){
                s = 1;
            }
            if(m>19){
                m = 1;
            }
            cnt++;
        }

        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();
    }
}
