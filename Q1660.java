import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1660 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int idx = 1;
        long[][] arr = new long[n+1][2];
        arr[1][0] = 1;
        arr[1][1] = 1;

        if (n >= 2) {
            n-=1;
            int tmp = idx;
            while(n>0){
                arr[idx][0] = arr[idx-1][0] + idx;
                System.out.println(". "+ arr[idx][0]);
                if(n - arr[idx][0]>=0){
                    n -= arr[idx][0];
                    arr[idx][1] = arr[idx-1][1] + arr[idx][0];
                    System.out.println(arr[idx][0]);
                    System.out.println(arr[idx][1]);
                    idx++;
                }
                else{
                    break;
                }
            }
        }
        System.out.println(n/arr[idx-1][1]);
    }
}
