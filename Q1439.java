import java.io.*;

public class Q1439 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int cnt_0 = 0;
		int cnt_1 = 0;
		String str = bf.readLine();
		int len = str.length();
		for(int i = 1;i<len;i++){
			if(i == len-1) {
				if (str.charAt(i - 1) == str.charAt(i)) {
					if (str.charAt(i - 1) == 48) {
						cnt_0++;
					}
					else {
						cnt_1++;
					}
				}
				else{
					if(str.charAt(i-1)==48 &&str.charAt(i)==49){
						cnt_0++;
						cnt_1++;
					}
					else if(str.charAt(i-1)==49 &&str.charAt(i)==48){
						cnt_1++;
						cnt_0++;
					}
				}
			}
			else{
				if(str.charAt(i-1)==48 &&str.charAt(i)==49){
					cnt_0++;
				}
				else if(str.charAt(i-1)==49 &&str.charAt(i)==48){
					cnt_1++;
				}
			}
		}
		System.out.println(cnt_0 > cnt_1 ? cnt_1 : cnt_0);
	}
}
