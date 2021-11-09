import java.io.*;
import java.util.*;

public class Q2805 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st1.nextToken());
		int tree[] = new int[n];
		int m = Integer.parseInt(st1.nextToken());
		int max = 0;
		int min = 0;
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			tree[i] = Integer.parseInt(st2.nextToken());
			if(max < tree[i]) {
				max = tree[i];
			}
		}
		//이분탐색
		while(min<max){
			int mid = (min+max)/2;
			long sum = 0;
			for(int i=0;i<tree.length;i++){
				if(tree[i]-mid>0){
					sum += (tree[i]-mid);
				}
			}
			if(sum<m){
				max = mid;
			}
			else{
				min = mid+1;
			}
		}
		System.out.println(min-1);
	}
}
