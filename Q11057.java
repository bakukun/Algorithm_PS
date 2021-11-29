import java.io.*;

public class Q11057 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        long sum = 10;
        long[][] d =  new long[n+1][10];
        for(int i = 0; i <= 9 ; i++){
            d[1][i] = 1;
        }
        for(int i = 2; i <= n ; i++){

            d[i][0] = sum % 10007;
            sum = d[i][0];
            d[i][9] = 1;
            sum++;
            for(int j = 8; j>=1; j--){
                d[i][j] = d[i-1][j]+ d[i][j+1] % 10007 ;
                sum += d[i][j];
            }
        }

        long cnt = 0;
        for(int i = 0; i <= 9 ; i++){
            cnt += d[n][i];
        }
        System.out.println(cnt%10007);
    }
}
