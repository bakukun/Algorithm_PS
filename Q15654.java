import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q15654 {

	public static int[] arr;
	public static int[] num;
	public static boolean[] visit;
	public static StringBuilder sb = new StringBuilder();
	public static int N ;
	public static int M ;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine()," ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		StringTokenizer st2 = new StringTokenizer(bf.readLine()," ");
		num = new int[N];
		visit = new boolean[N];
		for(int i = 0; i < N; i++){
			num[i] = Integer.parseInt(st2.nextToken());
		}
		Arrays.sort(num);
		arr = new int[M];
		dfs(0);
		System.out.println(sb);
	}

	private static boolean findDuplicateValue() {
		for (int i = 0; i < arr.length; i++) {
			int num1 = arr[i];
			for (int j = 0; j < arr.length; j++) {
				if (i == j) continue;
				int num2 = arr[j];
				if (num1 == num2) {
					// System.out.println("중복 => " + i + ". " + str1);
					return false;
				}
			}
		}
		return true;
	}


	public static void dfs(int depth) {
		if (depth == M) {
			for (int val : arr) {
				//System.out.println("현재 depth: " + depth + " 현재 원소: " + val);
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}

		for (int i = 0; i < N; i++) {
			if (!visit[i]) {
				visit[i] = true;
				arr[depth] = num[i];
				dfs(depth + 1);
				visit[i] = false;
			}
		}
	}
}


