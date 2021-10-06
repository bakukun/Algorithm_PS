import java.util.Scanner;

public class Q13458 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		int b = sc.nextInt();
		int c = sc.nextInt();
		long cnt = 0;
		for(int j=0; j<n;j++){
			arr[j] -= b;
			cnt++;
			if (arr[j] >0) {
				cnt += (arr[j] / c);
				if (arr[j] % c != 0) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
