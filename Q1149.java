import java.io.*;
import java.util.StringTokenizer;

public class Q1149 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n  = Integer.parseInt(br.readLine());
		int[][] rgb = new int[n+1][3];
		int[][] d = new int[n+1][3];
		for(int i =1;i<=n;i++){
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			rgb[i][0] = Integer.parseInt(st.nextToken());
			rgb[i][1] = Integer.parseInt(st.nextToken());
			rgb[i][2] = Integer.parseInt(st.nextToken());
		}

		d[1][0] = rgb[1][0];
		d[1][1] = rgb[1][1];
		d[1][2] = rgb[1][2];

		for(int i = 2; i <= n; i++){
			d[i][0] = Math.min(d[i-1][1],d[i-1][2])+rgb[i][0];
			d[i][1] = Math.min(d[i-1][0],d[i-1][2])+rgb[i][1];
			d[i][2] = Math.min(d[i-1][0],d[i-1][1])+rgb[i][2];
		}

		bw.write(Integer.toString(Math.min(Math.min(d[n][0],d[n][1]),d[n][2])));
		bw.flush();
		bw.close();
	}
}
