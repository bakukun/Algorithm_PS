import java.io.*;
import java.util.*;

public class Q10816 {
	public static int lowerBound(int[] array,  int value) {
		int low = 0;
		int high = array.length;
		while (low < high) {
			final int mid = low + (high - low)/2;
			if (value <= array[mid]) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}
		return low;
	}
	public static int upperBound(int[] array, int value) {
		int low = 0;
		int high = array.length;
		while (low < high) {
			final int mid = low + (high - low)/2;
			if (value >= array[mid]) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		return low;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st1.nextToken());
		}

		Arrays.sort(arr);

		int m = Integer.parseInt(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");


		for(int i =0; i<m; i++) {
			int a = Integer.parseInt(st2.nextToken());
			sb.append(upperBound(arr, a) - lowerBound(arr, a)).append(' ');
		}
		System.out.println(sb);
	}
}
