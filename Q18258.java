import java.io.*;
import java.util.Deque;
import java.util.LinkedList;


public class Q18258 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Deque<Integer> queue = new LinkedList<>();
		int n = Integer.parseInt(bf.readLine());
		for (int i = 0; i < n; i++){
			String str = bf.readLine();
			int num = 0;
			if(str.contains("push")) {
				num = Integer.parseInt(str.substring(5));
				queue.add(num);
			}
			else if(str.equals("pop")){
				if(queue.isEmpty() == false){
					int a = queue.poll();
					bw.write(String.valueOf(a));
				}
				else{
					bw.write("-1");
				}
				bw.newLine();
			}
			else if(str.equals("size")){
				int size = queue.size();
				bw.write(String.valueOf(size));
				bw.newLine();
			}
			else if(str.equals("empty")){
				if(queue.isEmpty() == true){
					bw.write("1");
				}
				else{
					bw.write("0");
				}
				bw.newLine();
			}
			else if(str.equals("front")){
				if(queue.isEmpty() == false){
					int peek = queue.peek();
					bw.write(String.valueOf(peek));
				}
				else{
					bw.write("-1");
				}
				bw.newLine();
			}
			else if(str.equals("back")){
				if(queue.isEmpty() == false){
					int peekLast = queue.peekLast();
					bw.write(String.valueOf(peekLast));
				}
				else{
					bw.write("-1");
				}
				bw.newLine();
			}
		}
		bw.flush();
		bw.close();
	}
}
