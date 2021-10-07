import java.io.*;

public class Q1193 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		int tmp = n;
		int max = 0;
		for (int i = 1 ; i <=n ; i++) {
			if (tmp >= i) {
				if (tmp > i) {
					tmp -= i;
				}
				else if (tmp == i){
					max = i;
					break;
				}
			}
			else {
				max = i;
				break;
			}
		}
		if (max%2==0){
			bw.write( String.valueOf(tmp)+ "/"+String.valueOf(max-tmp+1));
		}
		else {
			bw.write( String.valueOf(max-tmp+1)+"/"+String.valueOf(tmp));
		}
		bw.flush();
		bw.close();
	}
}
