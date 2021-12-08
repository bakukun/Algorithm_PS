import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Q2293 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] d = new int[k+1];
        int[] money = new int[n];

        for(int i = 0 ; i < n; i++){
            money[i] = Integer.parseInt(bf.readLine());
        }
        d[0] = 1;
        Arrays.sort(money);

        for (int i = 0; i < n; i++) {
            for(int j = money[i]; j <=k;j++){
                d[j] += d[j - money[i]];
            }
        }
        if(d[k] == Integer.MAX_VALUE-1){
            System.out.println(-1);
        }
        else{
            System.out.println(d[k]);
        }
    }
}


