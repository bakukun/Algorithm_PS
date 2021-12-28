import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1890 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[][] arr = new int[n + 1][n + 1];
        long[][] dp = new long[n + 1][n + 1];
        for(int i = 1; i<= n; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine()," ");
            for(int j = 1; j<=n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dp[1][1] = 1;
        for(int i = 1; i<= n; i++){
            for(int j = 1; j<=n; j++){
                int tmp = arr[i][j];
                if(tmp == 0) break;
                if(i+tmp<=n){
                    dp[i+tmp][j] += dp[i][j];
                }
                if(j+tmp<=n){
                    dp[i][j+tmp] += dp[i][j];
                }
            }
        }
        System.out.print(dp[n][n]);
      //  for(int i = 1; i<= n; i++){
       //     for(int j = 1; j<=n; j++){
     //           System.out.print(dp[i][j]);
     //           System.out.print(" ");
     //       }
     //       System.out.print("\n");
    //    }
    }
}
