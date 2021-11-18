import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int sum = 0;
        int[] a = new int[n];
        int[] b = new int[n];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        StringTokenizer st2 = new StringTokenizer(bf.readLine());
        for(int i = 0; i < n; i++){
            b[i] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(a);
        Integer[] b2 = Arrays.stream(b).boxed().toArray(Integer[]::new);
        Arrays.sort(b2, Collections.reverseOrder());
        for(int i=0; i<n;i++){
            sum += (b2[i] * a[i]);
        }
        bw.write(Integer.toString(sum));
        bw.flush();
        bw.close();
    }
}
