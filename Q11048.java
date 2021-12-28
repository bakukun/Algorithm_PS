import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11048 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer ST = new StringTokenizer(bf.readLine()," ");
        int n = Integer.parseInt(ST.nextToken());
        int m = Integer.parseInt(ST.nextToken());
        int[][] arr = new int[n + 1][m + 1];
        int[][] dp = new int[n + 1][m + 1];
        for(int i = 1; i<= n; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine()," ");
            for(int j = 1; j<=m; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dp[1][1]=arr[1][1];
        for(int i = 1; i<= n; i++){
            for(int j = 1; j<=m; j++){
                if(i+1<=n && j+1<=m){
                    dp[i+1][j+1]= Math.max(arr[i+1][j+1]+dp[i][j],dp[i+1][j+1]);
                }
                if(j+1<=m){
                    dp[i][j+1] =  Math.max(arr[i][j+1]+dp[i][j],dp[i][j+1]);
                }
                if(i+1<=n){
                    dp[i+1][j] =  Math.max(arr[i+1][j]+dp[i][j],dp[i+1][j]);
                }
            }
        }
        System.out.print(dp[n][m]);
    }
}

