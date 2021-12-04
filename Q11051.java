import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Q11051 {
	public static BigInteger cmb(int A,int B){
		BigInteger cnt = new BigInteger("1");
		BigInteger div = new BigInteger("1");
		int tmp = A;
		if (B-A<A){
			A = B-A;
			for(int i =B; i>tmp; i--){
				cnt = cnt.multiply(BigInteger.valueOf(i));
			}
			for(int i =1; i<=A; i++){
				div = div.multiply(BigInteger.valueOf(i));
			}
			return cnt.divide(div);
		}
		else {
			tmp = B-A;
			for(int i =B; i>tmp; i--){
				cnt = cnt.multiply(BigInteger.valueOf(i));
			}
			for(int i =1; i<=A; i++){
				div = div.multiply(BigInteger.valueOf(i));
			}
			return cnt.divide(div);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		BigInteger ans = new BigInteger(String.valueOf(cmb(b,a)));
		bw.write(String.valueOf(ans.mod(BigInteger.valueOf(10007))));
		bw.flush();
		bw.close();
	}
}

