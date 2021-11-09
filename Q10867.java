import java.io.*;
import java.util.*;

public class Q10867 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		for (int i = 0; i < n; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		HashSet<Integer> hs = new HashSet<>(arr);
		ArrayList<Integer> newarr = new ArrayList<Integer>(hs);
		int[] array = newarr.stream().mapToInt(i->i).toArray();
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++){
			bw.write(Integer.toString(array[i]));
			bw.write(" ");
		}
		bw.flush();
		bw.close();
	}
}
