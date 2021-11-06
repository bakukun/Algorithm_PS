import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Q11723 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashSet<Integer> hs = new HashSet<>();
		int n = Integer.parseInt(bf.readLine());
		for (int i = 0; i < n; i++) {
			String line = bf.readLine();
			if (line.contains("all") || line.contains("empty")) {
				if (line.equals("empty")) {
					hs.clear();
				} else if (line.equals("all")) {
					hs.clear();
					for (int j = 0; j <= 20; j++) {
						hs.add(j);
					}
				}
			} else {
				StringTokenizer st = new StringTokenizer(line, " ");
				String str = st.nextToken();
				String tmp = st.nextToken();
				int a = Integer.parseInt(tmp);
				if (str.equals("add")) {
					hs.add(a);
				} else if (str.equals("remove")) {
					hs.remove(a);
				} else if (str.equals("check")) {
					if (hs.contains(a)) {
						bw.write("1");
					} else {
						bw.write("0");
					}
					bw.newLine();
					bw.flush();
				} else if (str.equals("toggle")) {
					if (hs.contains(a)) {
						hs.remove(a);
					} else {
						hs.add(a);
					}
				}
			}
		}
		bw.close();
	}
}
