import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2847 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int sum = 0;
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = Integer.parseInt(bf.readLine());
        }
        for(int i = n-1; i > 0; i--){
            if(arr[i] <= arr[i-1]){
                sum += arr[i-1] - (arr[i] - 1);
                arr[i-1] = arr[i] - 1;
            }
        }
        System.out.println(sum);
    }
}
