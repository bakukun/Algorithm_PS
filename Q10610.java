import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Q10610 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		boolean zero = false;
		int cnt = 0;
		int[] arr = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i) - '0';
			cnt += arr[i];
			if(arr[i] == 0){
				zero = true;
			}
		}
		if(cnt % 3 != 0 || zero == false){
			bw.write("-1");
		}
		else{
			Integer[] arr3 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
			Arrays.sort(arr3, Collections.reverseOrder());
			int[] arr4 = Arrays.stream(arr3).mapToInt(i->i).toArray();
			for (int i = 0; i < str.length(); i++) {
				bw.write(Integer.toString(arr4[i]));
			}
		}
		bw.flush();
		bw.close();
	}
}
