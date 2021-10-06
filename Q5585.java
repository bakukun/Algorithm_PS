import java.util.Scanner;

public class Q5585 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int n = 1000-a;
		int cnt = 0;
		int[] coin = {500, 100, 50, 10, 5, 1};

		for (int i = 0; i < 6; i++) {
			cnt += (n / coin[i]);
			n %= coin[i];
		}
		System.out.print(cnt);
	}
}
