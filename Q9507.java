import java.io.*;
import java.math.BigInteger;

public class Q9507 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BigInteger[] arr = new BigInteger[68];
		arr[0] = BigInteger.ONE;
		arr[1] = BigInteger.ONE;
		arr[2] = BigInteger.TWO;
		arr[3] = BigInteger.TWO.add(BigInteger.TWO);
		for(int i = 4; i <= 67;i++){
			arr[i] = ((arr[i-1].add(arr[i-2])).add(arr[i-3])).add(arr[i-4]);
		}
		int n = Integer.parseInt(bf.readLine());
		for(int k = 0; k< n; k++){
			int ans = Integer.parseInt(bf.readLine());
			bw.write(String.valueOf(arr[ans]));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}