import java.io.*;
import java.util.StringTokenizer;

public class Q1912 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		int[] d = new int[100001];
		int[] arr = new int[n + 1];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int max = Integer.MIN_VALUE;
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 1; i <= n; i++) {
			d[i] = Math.max(arr[i],d[i-1]+arr[i]);
			max = Math.max(d[i],max);
		}
		bw.write(Integer.toString(max));
		bw.flush();
		bw.close();
	}
}

