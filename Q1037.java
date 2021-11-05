import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        bw.write(Integer.toString(arr[0]*arr[n-1]));
        bw.flush();
        bw.close();
    }
}
