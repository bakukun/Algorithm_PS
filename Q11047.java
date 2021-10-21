import java.util.Scanner;

public class Q11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] money = new int[n];
        int cnt = 0;
        for(int i=0; i<n; i++) {
            money[i] = sc.nextInt();
        }
        while(n>=1){
            int div = m / money[n-1];
            cnt += (div);
            if(div>0) {
                m %= money[n - 1];
            }
            n--;
        }
        System.out.println(cnt);
    }
}
