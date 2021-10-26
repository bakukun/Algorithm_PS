import java.io.*;
import java.util.*;

public class Q1920 {
	public static int BinSearch(int[] a,int n,int key){
		int pl = 0;
		int pr = n-1;

		do {
			int pc = (pl+pr)/2;
			if(a[pc]==key){
				return 1;
			}
			else if (a[pc]<key){
				pl = pc+1;
			}
			else{
				pr = pc-1;
			}
		} while(pl<=pr);
		return 0;
	}


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st1.nextToken());
		}
		Arrays.sort(arr);
		int m = Integer.parseInt(br.readLine());
		int[] arr2 = new int[m];
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		for(int i =0; i<m; i++){
			arr2[i] = Integer.parseInt(st2.nextToken());
		}
		for(int a = 0; a<m; a++) {
			bw.write(Integer.toString(BinSearch(arr,arr.length,arr2[a])));
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
}
