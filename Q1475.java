import java.util.Scanner;

public class Q1475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int[] arr = new int[10];
        if (n==0){
            System.out.println(1);
        }
        else {
            while (n != 0) {
                arr[n % 10]++;
                n /= 10;
            }
            int six = arr[6];
            int nine = arr[9];

            if ((arr[6] + arr[9]) % 2 == 0) {
                arr[6] = ((six + nine) / 2);
                arr[9] = ((six + nine) / 2);
            } else {
                arr[6] = ((six + nine) / 2) + 1;
                arr[9] = ((six + nine) / 2) + 1;
            }
            for (int i = 0; i < 10; i++) {
                if (arr[i] > cnt) {
                    cnt = arr[i];
                }
            }
            System.out.println(cnt);
        }
    }
}
