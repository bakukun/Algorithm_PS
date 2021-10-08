import java.io.*;
import java.lang.*;


public class Q1977 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int m = Integer.parseInt(bf.readLine());
		int n = Integer.parseInt(bf.readLine());
		int sum = 0;
		int min = n;
		for(int i = m; i<= n; i++){
			int tmp = (int)Math.round(Math.sqrt(i));
			if (Math.pow(tmp,2) == i){
				sum += i;
				if(i < min){
					min = i;
				}
			}
		}
		if(sum == 0){
			bw.write("-1");
		}
		else{
			bw.write(String.valueOf(sum)+"\n"+String.valueOf(min));
		}
		bw.flush();
		bw.close();
	}
}
