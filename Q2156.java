import java.io.*;

public class Q2156 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		int[] arr = new int[n+1];
		int[] d = new int[n+1];
		for(int i =1;i<=n;i++){
			arr[i] = Integer.parseInt(bf.readLine());
		}
		d[1] = arr[1];
		if(n>=2){
			d[2] = d[1]+arr[2];
		}

		for(int i=3;i<=n;i++) {
			int A = d[i - 2] + arr[i];
			int B = d[i - 1];
			int C = d[i-3]+arr[i-1]+arr[i];
			d[i] = Math.max(C,Math.max(A, B));
		}
		bw.write(Integer.toString(d[n]));
		bw.flush();
		bw.close();
	}
}
