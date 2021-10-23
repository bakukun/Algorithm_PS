import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q10866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		Deque<Integer> deque=new LinkedList<>();
		for(int i =0 ; i < cnt; i++){
			String str = br.readLine();
			int num = 0;
			if(str.contains("push_front")) {
				num = Integer.parseInt(str.substring(11));
				deque.addFirst(num);
			}
			else if(str.contains("push_back")) {
				num = Integer.parseInt(str.substring(10));
				deque.addLast(num);
			}
			else if(str.equals("pop_front")){
				if (!deque.isEmpty()) {
					int a = deque.removeFirst();
					System.out.println(a);
				}
				else {
					System.out.println(-1);
				}
			}
			else if(str.equals("pop_back")){
				if (!deque.isEmpty()) {
					int a = deque.removeLast();
					System.out.println(a);
				}
				else {
					System.out.println("-1");
				}
			}
			else if(str.equals("size")){
				System.out.println(deque.size());
			}
			else if(str.equals("empty")){
				if (!deque.isEmpty()) {
					System.out.println("0");
				}
				else {
					System.out.println("1");
				}
			}
			else if(str.equals("front")){
				if (!deque.isEmpty()) {
					System.out.println(deque.peekFirst());
				}
				else {
					System.out.println("-1");
				}
			}
			else if(str.equals("back")){
				if (!deque.isEmpty()) {
					System.out.println(deque.peekLast());
				}
				else {
					System.out.println("-1");
				}
			}
		}
	}
}
