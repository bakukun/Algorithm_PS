import java.io.*;
import java.util.StringTokenizer;

public class Q2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        if ((v-b)%(a-b)==0){
            System.out.println(((v-b)/(a-b)));
        }
        else{
            System.out.println(((v-b)/(a-b))+1);
            }
        bw.flush();
        bw.close();
    }
}
