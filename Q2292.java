import java.util.Scanner;

public class Q2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt = 1;
        int plus = 6;
        int sum = 1;
        if (a == 1) {
            System.out.print(1);
        }
        else {
            while(true){
                sum += plus;
                plus += 6;
                cnt++;
                if (a <= sum) {
                    break;
                }
            }
            System.out.print(cnt);
        }
    }
}
