import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11052 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n + 1];
        int[] d = new int[n + 1];
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        for (int i = 1 ; i <= n ; i ++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        d[1] = arr[1];
        for(int i = 2 ; i <= n; i++){
            for(int j = 1; j < i; j++){
                d[i] = Math.max(Math.max(d[i-j]+arr[j],d[i]),arr[i]);
            }
        }
        System.out.println(d[n]);
    }
}
