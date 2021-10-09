import java.io.*;
import java.util.StringTokenizer;

public class Q10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(bf.readLine());
        int x,y;
        for(int i=0; i <cnt; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            if (n%h ==0) {
                y = h;
                x = (n / h);
            }
            else{
                y = n%h;
                x = (n/h)+1;
            }
            if (x>=10) {
                bw.write(String.valueOf(y)+String.valueOf(x));
            }
            else {
                bw.write(String.valueOf(y)+"0"+String.valueOf(x));
            }
            if(i==(cnt-1)){
                break;
            }
            else{
            bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
