import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1966 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		for(int i=0; i < n; i++){
			Queue<Integer> queue = new LinkedList<>();
			StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
			int size = Integer.parseInt(st.nextToken());
			int idx = Integer.parseInt(st.nextToken());
			int real_idx = idx;
			int search = 0;
			int cnt = 0;
			int max = 0;
			StringTokenizer st2 = new StringTokenizer(bf.readLine(), " ");
			for(int j =0; j<size; j++){
				int tmp = Integer.parseInt(st2.nextToken());
				if(max<tmp){
					max = tmp;
				}
				if(j == idx){
					search = tmp;
				}
				queue.add(tmp);
			}

			while(!queue.isEmpty()) {
				if(queue.size()!= size){
					max = 0;
					for(int a=0; a< queue.size(); a++){
						idx = queue.peek();
						if(max<idx){
							max = idx;
						}
						queue.poll();
						queue.add(idx);
					}
				}
				if (queue.peek() < max) {
					idx = queue.peek();
					queue.poll();
					queue.add(idx);
					real_idx--;
					if(real_idx<0){
						real_idx = queue.size()-1;
					}
				}
				else if (queue.peek() == max){
					cnt++;
					if(max == search  && real_idx == 0){
						break;
					}
					queue.poll();
					real_idx--;
					if(real_idx<0){
						real_idx = queue.size()-1;
					}
				}
			}
			bw.write(Integer.toString(cnt));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}
