import java.io.*;
public class Q17213 {
	public static long cmb(int A,int B){
		long cnt = 1;
		long div = 1;
		int tmp = A;
		if (B-A<A){
			A = B-A;
			for(int i =B; i>tmp; i--){
				cnt *=i;
			}
			for(int i =1; i<=A; i++){
				div *=i;
			}
			return cnt/div;
		}
		else {
			tmp = B-A;
			for(int i =B; i>tmp; i--){
				cnt *=i;
			}
			for(int i =1; i<=A; i++){
				div *=i;
			}
			return cnt/div;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int b = Integer.parseInt(bf.readLine());
		b-=a;
		a = (a+b-1);
		System.out.print(cmb(b,a));
	}
}
