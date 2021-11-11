import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11004 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int k = Integer.parseInt(st.nextToken());
        StringTokenizer st2 = new StringTokenizer(bf.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(arr);
        bw.write(Integer.toString(arr[k-1]));
        bw.flush();
        bw.close();
    }
}
