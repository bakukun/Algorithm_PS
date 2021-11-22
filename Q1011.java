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
			long cnt = 0;
			long mul = 1;
			long k = y - x;
			while(k>cnt+2*mul){
				cnt += 2*mul;
				mul++;
			}
			if(cnt+mul>=k){
				mul = 2*mul-1;
			}
			else{
				mul *=2;
			}
			bw.write(Long.toString(mul));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}
