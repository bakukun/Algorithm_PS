import java.io.*;
import java.util.StringTokenizer;

public class Q1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int[][] tri = new int[n+1][n+1];
        int[][] dp = new int[n+1][n+1];

        for(int i=1; i<=n;i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for(int j=1 ; j<=i; j++){
                tri[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[1][1] = tri[1][1];

        for(int i =2; i <=n; i++) {
            for (int j = 1; j <= (i); j++) {
                if(j==1){
                    dp[i][j] = dp[i - 1][j] +tri[i][j];
                }
                else{
                    dp[i][j] = tri[i][j]+Math.max(dp[i - 1][j] , dp[i - 1][j-1]) ;
                }

            }
        }


        int max = -1;
        if(n==1){
            bw.write(Integer.toString(dp[1][1]));
        }
        else{
            for(int i =1; i<=n; i++){
                if(dp[n][i]>max){
                    max = dp[n][i];
                }
            }
            bw.write(Integer.toString(max));
        }
        bw.flush();
        bw.close();
    }
}
