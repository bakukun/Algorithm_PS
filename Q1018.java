import java.io.*;
import java.util.StringTokenizer;

public class Q1018 {
	public static boolean[][] arr;
	public static int min = 64;

	public static void find(int x,int y){
		int max_x = x+8;
		int max_y = y+8;
		int cnt = 0;
		boolean color = arr[x][y];
		for (int i = x; i < max_x; i++) {
			for (int j = y; j < max_y; j++) {
				if (arr[i][j] != color) {
					cnt++;
				}
				color = (!color);
			}
			color = (!color);
		}
		cnt = Math.min(cnt,64-cnt);
		min = Math.min(min,cnt);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		arr = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < m; j++) {
				if (str.charAt(j) == 'W') {
					arr[i][j] = true;
				} else {
					arr[i][j] = false;
				}
			}
		}
		int i_max = n - 7;
		int j_max = m - 7;

		for (int i = 0; i < i_max; i++) {
			for (int j = 0; j < j_max; j++) {
				find(i, j);
			}
		}
		bw.write(Integer.toString(min));
		bw.flush();
		bw.close();
	}
}

