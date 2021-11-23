import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9663 {
	static int n;
	static int cnt;
	static boolean[] flag_a;
	static boolean[] flag_b;
	static boolean[] flag_c;
	static int[] pos;

	static void set(int i){
		for(int j =0; j <n;j++){
			if( flag_a[j]==false && flag_b[i+j]==false && flag_c[i-j+(n-1)]==false){
				pos[i] = j;
				if(i==n-1){
					cnt++;
				}
				else{
					flag_a[j] = flag_b[i+j] = flag_c[i-j+(n-1)]= true;
					set(i+1);
					flag_a[j] = flag_b[i+j] = flag_c[i-j+(n-1)]= false;
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(bf.readLine());
		pos = new int[n];
		flag_a = new boolean[n];
		flag_b = new boolean[n*2-1];
		flag_c = new boolean[n*2-1];
		set(0);
		System.out.print(cnt);
	}
}
