import java.io.*;

public class Q17212 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int[] d = new int[100001];

		for (int i = 1; i <= n; i++) {
			d[i] = i;
		}

		d[1] = 1;
		d[2] = 1;
		d[5] = 1;
		d[7] = 1;

		if(n>=3){
			for(int i = 3; i<=n; i++){
				for(int j = 1;j<=7;){
					if( j > n || i-j<=0 ){
						break;
					}
					else{
						if(d[i]>d[i-j]+1){
							d[i] = d[i-j]+1;
						}
						if ( j == 1){
							j = 2;
						} else if (j == 2){
							j = 5;
						} else if (j == 5){
							j = 7;
						} else if ( j >= 7){
							break;
						}
					}
				}
			}
		}
		System.out.println(d[n]);
	}
}
