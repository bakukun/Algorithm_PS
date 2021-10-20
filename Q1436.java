import java.io.*;

public class Q1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(bf.readLine());
        int count = 1;
        int n = 666;
        while(count!= cnt){
            n++;
            if(String.valueOf(n).contains("666")){
                count++;
            }
        }
        bw.write(Integer.toString(n));
        bw.flush();
        bw.close();
    }
}
