import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q9465 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        for(int i = 0; i < n; i++){
            int cnt = Integer.parseInt(bf.readLine());
            int[][] arr = new int[cnt+1][2];
            int[][] dp = new int[cnt+1][2];
            for(int j = 0; j < 2; j++){
                StringTokenizer st = new StringTokenizer(bf.readLine()," ");
                for(int k = 1; k<=cnt; k++){
                    arr[k][j] = Integer.parseInt(st.nextToken());
                    dp[k][j] = arr[k][j];
                }
            }
            for(int j = 2; j<=cnt; j++){
                dp[j][0]=Math.max(dp[j-1][1],dp[j-2][1])+arr[j][0];
                dp[j][1]=Math.max(dp[j-1][0],dp[j-2][0])+arr[j][1];
            }


            System.out.println(Math.max(dp[cnt][0],dp[cnt][1]));
        }
    }
}
