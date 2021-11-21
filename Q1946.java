import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1946 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		for (int i = 0; i < n; i++) {
			int tries = Integer.parseInt(bf.readLine());
			int cnt = 1;
			int[][] arr = new int [tries][2];
			for (int j = 0; j < tries; j++) {
				StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
				arr[j][0] = Integer.parseInt(st.nextToken());
				arr[j][1] = Integer.parseInt(st.nextToken());
			}
			//0번째 idx 기준
			Arrays.sort(arr, (o1, o2) -> {
				if(o1[0] == o2[0]) {
					return Integer.compare(o1[1], o2[1]);
				}
				else {
					return Integer.compare(o1[0],o2[0]);
				}
			});
			int tmp = arr[0][1];
			for(int k =1; k< tries; k++){
				if(tmp > arr[k][1]){
					tmp = arr[k][1];
					cnt++;
				}
			}
			bw.write(Integer.toString(cnt));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}
