import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15652 {

	public static int[] arr;
	public static StringBuilder sb = new StringBuilder();
	public static int N ;
	public static int M ;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine()," ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[M];
		dfs(0,1);
		System.out.println(sb);

	}

	public static void dfs(int depth,int I) {
		if (depth == M) {
			for (int val : arr) {
				//System.out.println("현재 depth: "+depth+" 현재 원소: "+val);
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}

		for (int i = I; i <= N; i++) {
			//System.out.println("현재 depth: "+depth+" 현재 i: "+i);
			arr[depth] = i;
			dfs(depth + 1 , i);
		}
	}
}

