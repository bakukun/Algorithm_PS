import java.io.*;
import java.util.StringTokenizer;

public class Q11050 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int ans = 1;
		int tmp = b;
		int div = 1;
		for(int i = a; i > a-b; i--){
			ans *= i;
			div *= tmp;
			tmp--;
		}
		bw.write(String.valueOf(ans/div));
        bw.flush();
        bw.close();
		}
}
