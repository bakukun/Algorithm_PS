import java.io.*;
import java.util.StringTokenizer;

public class Q1011 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			long x = Integer.parseInt(st.nextToken());
			long y = Integer.parseInt(st.nextToken());
			long k = 0;
			long cnt = 0;
			while(y-x>1){
				k++;
				x+=k;
				cnt++;
			}
			bw.write(Long.toString(cnt+1));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}
