import java.util.Arrays;
import java.util.Scanner;

public class Q5543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] b = new int[3];
        int[] d = new int[2];
        for (int i = 0; i < 3; i++) {
            b[i] = sc.nextInt();
        }
        Arrays.sort(b);
        for (int i = 0; i < 2; i++) {
            d[i] = sc.nextInt();
        }
        Arrays.sort(d);
        System.out.println(b[0] + d[0] - 50);
    }
}
