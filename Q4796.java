import java.io.*;
import java.util.StringTokenizer;

public class Q4796 {
	public static int cal(int L,int P,int V){
		int sum = ( (V / P) * L );
		int mod = (V % P);
		if (mod <= L){
			sum +=mod;
		}
		else{
			sum+=L;
		}
		return sum;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt = 1;
		while (true) {
			StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			if(a == 0 && b == 0 && c == 0){
				break;
			}

			if(cnt>1){
				bw.write("\n");
			}

			bw.write("Case "+String.valueOf(cnt)+": "+String.valueOf(cal(a,b,c)));
			cnt++;
		}
		bw.flush();
		bw.close();
	}
}
