import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Q10826 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		BigInteger[] arr = new BigInteger[10001];
		arr[1] = BigInteger.ONE;
		arr[2] = BigInteger.ONE;
		for(int i = 3; i <= n;i++){
			arr[i] = arr[i-1].add(arr[i-2]);
		}
		if(n==0){
			System.out.print(0);
		}
		else{
			System.out.print(arr[n]);
		}
	}
}
