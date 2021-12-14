import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1485 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());

		Loop:
		for (int i = 0; i < n; i++) {
			double[][] arr = new double[4][2];
			double[] tmp = new double[6];
			int idx = 0;

			for (int j = 0; j < 4; j++) {
				StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
				arr[j][0] = Double.parseDouble(st.nextToken());
				arr[j][1] = Double.parseDouble(st.nextToken());
				//System.out.println("좌표: "+arr[j][0]+" "+arr[j][1]);
			}

			for (int j = 0; j < 3; j++) {
				for(int k = j+1; k<4; k++){
					tmp[idx++] = Math.sqrt(Math.pow(arr[j][0]-arr[k][0],2)+Math.pow(arr[j][1]-arr[k][1],2));
				}
			}
			Arrays.sort(tmp);
			if(tmp[4] == tmp[5]){
				for (int j = 0; j < 3; j++) {
					for(int k = j+1; k<4; k++) {
						if (tmp[j] != tmp[k]) {
							System.out.println(0);
							continue Loop;
						}
					}
				}
				System.out.println(1);
			}
			else{
				System.out.println(0);
			}
		}
	}
}

