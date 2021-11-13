import java.io.*;
import java.util.*;

public class Q1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int cnt = 0;
		HashSet<String> hs = new HashSet<>();
		ArrayList<String> overlap = new ArrayList<>();
		for(int i =0; i < n;i++){
			hs.add(br.readLine());
		}
		for(int i=0;i<m;i++){
			String str = br.readLine();
			if(hs.contains(str)){
				overlap.add(str);
				cnt++;
			}
		}
		Collections.sort(overlap);
		bw.write(Integer.toString(cnt));
		bw.newLine();
		for(int i=0; i<overlap.size(); i++){
			bw.write(overlap.get(i));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}
