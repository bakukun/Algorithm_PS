import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1449 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int len = Integer.parseInt(st.nextToken());
		int cnt = 1;
		double[] arr = new double[n];
		StringTokenizer st2 = new StringTokenizer(bf.readLine()," ");
		for(int i = 0; i<n; i++){
			arr[i] = Integer.parseInt(st2.nextToken());
		}
		Arrays.sort(arr);

		double Limit = (arr[0] - 0.5 + len);
		for(int i = 1; i < arr.length; i++) {
			if (Limit < (arr[i] + 0.5)){
				Limit = (arr[i] - 0.5 + len);
				cnt++;
			}
		}
		System.out.print(cnt);
	}
}
