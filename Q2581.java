import java.io.*;

public class Q2581 {

	public static boolean prime[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		prime = new boolean[N + 1];	// 배열 생성
		get_prime();


		// 소수 합 및 최솟값
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for(int i = M; i <= N; i++) {
			if(prime[i] == false) {	// false = 소수
				sum += i;
				if(min == Integer.MAX_VALUE) {	// 첫 소수가 최솟값임
					min = i;
				}
			}
		}

		if(sum == 0) {	// 소수가 없다면
			bw.write("-1");
		}
		else {
			bw.write(Integer.toString(sum));
			bw.newLine();
			bw.write(Integer.toString(min));
		}
		bw.flush();
		bw.close();
	}


	// 에라토스테네스 체 알고리즘
	public static void get_prime() {
		prime[0] = true;
		prime[1] = true;

		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) {
				continue;
			}
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}
}