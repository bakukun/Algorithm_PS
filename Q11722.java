import java.io.*;
import java.util.StringTokenizer;

public class Q11722 {
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
			d[i] = 1;
		}
		for(int i = 0 ; i <= n; i++){
			for(int j = 0; j < i; j++){
				//System.out.println("d["+i+"] :"+d[i]+"d["+j+"] :"+d[j]+"arr["+i+"] :"+arr[i]+"arr["+j+"] :"+arr[j]);
				if(d[i]<d[j]+1 && arr[i]<arr[j]){
					d[i] = d[j]+1;
				}
			}
		}
		for(int i =1; i<=n;i++){
			//System.out.println(d[i]);
			if(max < d[i]){
				max = d[i];
			}
		}
		bw.write(Integer.toString(max));
		bw.flush();
		bw.close();
	}
}
