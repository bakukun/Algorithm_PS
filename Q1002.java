import java.io.*;
import java.util.StringTokenizer;

public class Q1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            if(r1>r2){
                int tmp1 = x1;
                int tmp2 = y1;
                int tmp3 = r1;
                x1 = x2;
                y1 = y2;
                r1 = r2;
                x2 = tmp1;
                y2 = tmp2;
                r2 = tmp3;
            }
            double d = Math.sqrt(Math.pow(Math.abs(x2-x1),2)+Math.pow(Math.abs(y2-y1),2));
            if(x1 == x2 && y1 == y2){
                if(r1 == r2){
                    bw.write("-1");
                }
                else{
                    bw.write("0");
                }
            }
            else{
                if (d>r1+r2 || r1+d<r2){
                    bw.write("0");
                }
                else if(r1+r2 == d || r2-r1 == d){
                    bw.write("1");
                }
                else if(r1+r2>d){
                    bw.write("2");
                }
            }
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
