import java.io.*;

public class Q1032 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		String[] str = new String[n];
		char[][] ab = new char[n][50];
		char tmp;
		if(n == 1){
			str[0] = bf.readLine();
			bw.write(str[0]);
		}
		else {
			for (int i = 0; i < n; i++) {
				str[i] = bf.readLine();
				for (int j = 0; j < str[i].length(); j++) {
					ab[i][j] = str[i].charAt(j);
				}
			}
			int strlen = str[n - 1].length();
			char[] ans = new char[strlen];
			for (int b = 0; b < strlen; b++) {
				tmp = ab[0][b];
				for (int a = 1; a < n; a++) {
					if (tmp != ab[a][b]) {
						ans[b] = '?';
						break;
					} else
						ans[b] = tmp;
				}
			}
			for (int k = 0; k < ans.length; k++) {
				bw.write(ans[k]);
			}
		}
		bw.flush();
		bw.close();
	}
}
