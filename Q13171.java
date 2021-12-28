import java.io.*;

public class Q13171 {
    private static long pow(long a, long b) {
        String s = Long.toBinaryString(b);

        long[] dp = new long[s.length() + 1];
        dp[1] = a % 1000000007;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = ((dp[i - 1] * dp[i - 1]) % 1000000007);
        }
        long ans = 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0') {
                ans *= ((dp[s.length() - i]) % 1000000007);
                ans %= 1000000007;
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        long a = Long.parseLong(bf.readLine());
        long b = Long.parseLong(bf.readLine());
        System.out.println(pow(a,b));
    }
}

