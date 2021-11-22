import java.io.*;
import java.util.StringTokenizer;

public class Q14501 {
    public static int[][] arr;
    public static int n;
    private static int max;

    public static void bye(int day,int sum){
        if(max<sum){
            max = sum;
        }
        if(day>n){
            return;
        }

        int tmp = day + arr[day][0];
        if(tmp <= n+1){
            bye(tmp,sum+arr[day][1]);
        }
        bye(day+1,sum);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(bf.readLine());
        arr = new int[n+1][2];
        int[] dp = new int[n+1];
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int day = Integer.parseInt(st.nextToken());
            int money = Integer.parseInt(st.nextToken());
            arr[i][0] = day;
            arr[i][1] = money;
        }
        bye(1,0);
        bw.write(Integer.toString(max));
        bw.flush();
        bw.close();
    }
}

