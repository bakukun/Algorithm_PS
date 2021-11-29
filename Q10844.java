import java.io.*;
public class Q10844 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        long[][] d =  new long[n+1][10];
        for(int i = 1; i <= 9 ; i++){
            d[1][i] = 1;
        }
        for(int i = 2; i <= n ; i++){
            d[i][0] = d[i-1][1] %1000000000 ;
            d[i][9] = d[i-1][8] %1000000000 ;
            for(int j = 1; j<=8; j++){
                d[i][j] = d[i-1][j-1]+ d[i-1][j+1] %1000000000 ;
            }
        }

        long cnt = 0;
        for(int i = 0; i <= 9 ; i++){
            cnt += d[n][i];
        }
        System.out.println(cnt%1000000000);
    }
}
