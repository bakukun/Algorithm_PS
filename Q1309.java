import java.io.*;

public class Q1309 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] d = new int[100001];
        d[1] = 3;
        d[2] = 7;
        for(int i = 3; i<=n;i++){
            d[i] = (d[i-2]+(d[i-1]*2))%9901;
        }
        System.out.println(d[n]);
    }
}
