import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2491 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int[] arr = new int[n+1];
		int[] d = new int [n+1];
		int[] d2 = new int [n+1];
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		for(int i = 1; i <= n; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int tmp = 1;
		int tmp2 = 2;
		int max = 0;
		int max2 = 0;
		d[1] = tmp;
		d2[1] = 1;
		for (int i = 1; i <= n; i++) {
			if (arr[i - 1] <= arr[i]) {
				d[i] = tmp++;
			} else {
				tmp = 1;
				d[i] = tmp++;
			}
			max = Math.max(d[i], max);
		}
		for (int i = 2; i <= n; i++){
			if(arr[i-1]>=arr[i]){
				d2[i] = tmp2++;
			}
			else{
				tmp2 = 1;
				d2[i] = tmp2++;
			}
			// System.out.println(i+"번째 d2: "+d2[i]+" max2: "+max2);
			max2 = Math.max(d2[i],max2);
		}

		System.out.print(Math.max(max,max2));
	}
}
