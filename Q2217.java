import java.io.*;
import java.util.Arrays;

public class Q2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int[] rope = new int[n];
        for(int i = 0 ; i < n ; i ++){
            rope[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(rope);
        int max = -1;
        for(int i = 0 ; i < n ; i ++){
            if(max<rope[i]*(n-i))
            max = rope[i]*(n-i);
        }
        bw.write(Integer.toString(max));
        bw.flush();
        bw.close();
    }
}
