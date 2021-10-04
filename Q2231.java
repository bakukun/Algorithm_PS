import java.util.*;

public class Q2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp = n;
        int digit = 0;
        while (tmp != 0) {
            tmp /= 10;
            digit++;
        }
        int start = n - (9*digit);
        if (start < 0) {
            start = 0;
        }
        int num = 0;
        int sum = 0;
        for(int i = start; i <=n; i++){
            num = i;
            sum += num;
            while(num > 0){
                sum += num % 10;
                num /=10;
            }
            if (sum == n){
                tmp = i;
                break;
            }
            sum = 0;
        }
        System.out.print(tmp);
    }
}
