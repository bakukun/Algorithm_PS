import java.io.*;
import java.util.StringTokenizer;

public class Q17216 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		int[] arr =  new int[n];
		int[] d = new int[n];
		StringTokenizer st  = new StringTokenizer(bf.readLine()," ");
		for(int i = 0; i < n ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		d[0] = arr[0];
		for(int i = 0; i < n; i++) {
			d[i] = arr[i];
			for(int j = 0; j < i; j++) {
				if(arr[j] > arr[i] && d[i] < d[j] + arr[i]) {
					d[i] = d[j] + arr[i];
				}
			}
		}
		int max = 0;
		for(int i=0; i<n;i++){
			if( max < d[i]){
				max = d[i];
			}
		}
		bw.write(Integer.toString(max));
		bw.flush();
		bw.close();
	}
}
