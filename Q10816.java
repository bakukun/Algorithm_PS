import java.io.*;
import java.util.*;

public class Q10816 {
	public static boolean BinSearch(int[] a,int n,int key){
		int pl = 0;
		int pr = n-1;

		do {
			int pc = (pl+pr)/2;
			if(a[pc]==key){
				return true;
			}
			else if (a[pc]<key){
				pl = pc+1;
			}
			else{
				pr = pc-1;
			}
		} while(pl<=pr);
		return false;
	}


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> arr = new ArrayList<Integer>();

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < n; i++) {
			arr.add(Integer.parseInt(st1.nextToken()));
		}

		HashSet<Integer> arr_x = new HashSet<Integer>(arr);
		ArrayList<Integer> arr_z = new ArrayList<Integer>(arr_x);

		int[] arr_real = arr_z.stream().mapToInt(i->i).toArray();

		int m = Integer.parseInt(br.readLine());
		int[] arr2 = new int[m];
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

		Arrays.sort(arr_real);

		for(int i =0; i<m; i++){
			arr2[i] = Integer.parseInt(st2.nextToken());
		}

		for(int a = 0; a<m; a++) {
			if(BinSearch(arr_real, arr_real.length, arr2[a])){
				bw.write(Integer.toString(Collections.frequency(arr, arr2[a])));
			}
			else{
				bw.write("0");
			}

			bw.write(" ");
			bw.flush();
		}

		bw.close();
	}
}
