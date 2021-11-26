import java.io.*;

public class Q2193 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		Long[] d = new Long[91];
		d[1] = 1l;
		d[2] = 1l;
		if(n>=3){
			for (int i = 3; i <= n ; i++){
				d[i] = d[i-1]+d[i-2];
			}
		}
		bw.write(Long.toString(d[n]));
		bw.flush();
		bw.close();
	}
}