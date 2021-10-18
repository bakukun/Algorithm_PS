import java.util.Scanner;

public class Q1789 {
	public static long sum(long n){
		long sum = 0;
		int cnt = 0;
		for (int i = 1; ;i++){
			sum+=i;
			cnt++;
			if(sum>n){
				return cnt - 1;
			}
			else if(sum == n){
				return cnt;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		System.out.println(sum(n));
	}
}
