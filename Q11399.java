import java.util.*;

public class Q11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int tmp = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for(int i =0; i < n ; i++){
            tmp+=arr[i];
            sum+=tmp;
        }
        System.out.println(sum);
    }
}

