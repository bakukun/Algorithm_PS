import java.io.*;
import java.util.StringTokenizer;

public class Q1010 {
    public static long cmb(int A,int B){
        long cnt = 1;
        long div = 1;
        int tmp = A;
        if (B-A<A){
            A = B-A;
            for(int i =B; i>tmp; i--){
                cnt *=i;
            }
            for(int i =1; i<=A; i++){
                div *=i;
            }
            return cnt/div;
        }
        else {
            tmp = B-A;
            for(int i =B; i>tmp; i--){
                cnt *=i;
            }
            for(int i =1; i<=A; i++){
                div *=i;
            }
            return cnt/div;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(Long.toString(cmb(a,b)));
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
