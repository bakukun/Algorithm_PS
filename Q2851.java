import java.io.*;

public class Q2851 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[10];
        int[] sum = new int[10];
        int cnt = 0;
        int tmp = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
            cnt += arr[i];
            sum[i] = cnt;
        }
        int min = Math.abs(sum[0] - 100);
        for (int i = 0; i < 10; i++) {
            sum[i] = Math.abs(sum[i] - 100);
            if (min >= sum[i]) {
                min = sum[i];
                tmp = i;
                if (min == 0) {
                    break;
                }
            }
        }
        cnt = 0;
        for (int i = 0; i <= tmp; i++) {
            cnt += arr[i];
        }
        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();
    }
}
