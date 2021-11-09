import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q18111 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int minsec = Integer.MAX_VALUE;
		int max_h = 0;
		int cnt = 0;
		int[][] arr = new int[n][m];
		for(int i = 0; i < n; i++){
			StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j<m; j++){
				arr[i][j] = Integer.parseInt(st2.nextToken());
				cnt += arr[i][j];
			}
		}
		for(int h = 0; h<=256; h++){
			int add = 0;
			int remove = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					int z = arr[i][j] - h;
					if (z > 0) {
						remove += z;
					} else {
						add -= z;
					}
				}
			}
			if(add>remove+b){
				continue;
			}
			int sec = (remove*2) + add;
			if(sec <= minsec){
				minsec = sec;
				max_h = h;
			}
		}
		System.out.println(minsec+" "+max_h);
	}
}
