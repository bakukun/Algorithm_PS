import java.util.Scanner;

public class Q2167 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for(int a=0; a<n; a++){
			for(int b = 0; b<m; b++){
				arr[a][b] = sc.nextInt();
			}
		}
		int cnt = sc.nextInt();
		for(int k=0; k < cnt; k++){
			int i = sc.nextInt();
			int j = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int sum = 0;
			for(int c=(i-1); c<x; c++){
				for(int d=(j-1); d<y; d++){
					sum+=arr[c][d];
				}
			}
			System.out.println(sum);
		}
	}
}
