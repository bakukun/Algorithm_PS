import java.io.*;

public class Q2748 {

	public static long fi(int n,long[] arr){
		if(n<=0){
			return 0;
		}
		else if (n==1){
			return arr[n]=1;
		}
		else if (arr[n]>0){
			return arr[n];
		}
		else {
			return arr[n] = fi(n-1,arr)+fi(n-2,arr);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		long[] arr = new long[n+1];
		bw.write(String.valueOf(fi(n,arr)));
		bw.flush();
		bw.close();
	}
}