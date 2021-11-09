import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1654 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int k = Integer.parseInt(st.nextToken());
		int line[] = new int[k];
		int n = Integer.parseInt(st.nextToken());
		long tmp = 0;
		for(int i=0;i<k;i++){
			line[i] = Integer.parseInt(br.readLine());
			tmp += line[i];
		}
		Arrays.sort(line);
		long max = (tmp/n)+1;
		long min = line[0]/n;
		while(min<max){
			long mid = (max+min)/2;
			long cnt = 0;
			for(int i=0;i<k;i++){
				cnt += (line[i]/mid);
			}
			if(cnt<n){
				max = mid;
			}
			else{
				min = mid+1;
			}

		}
		System.out.println(min-1);
	}
}
