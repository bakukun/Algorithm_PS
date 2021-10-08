import java.io.*;

public class Q9093 {
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		String[] str = new String[n];
		for(int i=0; i<n; i++){ //횟수
			str[i] = bf.readLine(); // 입력받아서 배열 삽입
			StringBuilder word = new StringBuilder(); // 빈 문자열
			for(int k=0; k< str[i].length(); k++){ //단어수만큼 반복
				if(str[i].charAt(k) == ' '){ // 공백일경우
					for(int j=(word.length()-1); j>=0; j--){
						bw.write(word.charAt(j));
					}
					bw.write(str[i].charAt(k));
					word.setLength(0);
				}
				else if(k==(str[i].length()-1)){
					word.append(str[i].charAt(k));
					for(int l=(word.length()-1); l>=0; l--){
						bw.write(word.charAt(l));
					}
				}
				else{
					word.append(str[i].charAt(k));
				}
			}
			bw.write("\n"); // 문장 줄바꿈
		}
		bw.flush();
		bw.close();
	}
}
