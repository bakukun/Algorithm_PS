import java.io.*;
import java.util.StringTokenizer;

public class Q11055 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		int[] d = new int[1001];
		int[] arr = new int[n + 1];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int max = Integer.MIN_VALUE;
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			d[i] = arr[i];
		}
		for(int i = 0; i <=n; i++){
			for(int j = 0 ; j < i ; j++){
				if(d[i]<d[j]+arr[i] && arr[j] < arr[i]){
					d[i] = d[j]+ arr[i];
				}
			}
		}
		for(int i =1; i<=n;i++){
			if(max< d[i]){
				max = d[i];
			}
		}
		bw.write(Integer.toString(max));
		bw.flush();
		bw.close();
	}
}
