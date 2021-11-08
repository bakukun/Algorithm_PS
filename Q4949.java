import java.io.*;
import java.util.Stack;

public class Q4949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str;
		Stack<String> stack = new Stack<>();
		while (!(str = br.readLine()).equals(".")) {
			stack.clear();
			boolean cnt1 = true;
			boolean cnt2 = true;
			int len = str.length();
			for(int i = 0; i < len; i++){
				if (str.charAt(i) == '('){
					stack.push("(");
				}
				else if(str.charAt(i) == '['){
					stack.push("[");
				}
				else if(str.charAt(i) == ')'){
					if( (!stack.isEmpty()) && (stack.peek().equals("(")) ){
						stack.pop();
					}
					else{
						cnt1 = false;
						bw.write("no\n");
						break;
					}
				}
				else if(str.charAt(i) == ']'){
					if((!stack.isEmpty()) && (stack.peek().equals("[")) ){
						stack.pop();
					}
					else{
						cnt1 = false;
						bw.write("no\n");
						break;
					}
				}
			}
			if(cnt1 && cnt2){
				if(stack.isEmpty()){
					bw.write("yes\n");
				}
				else{
					bw.write("no\n");
				}

			}
		}
		bw.flush();
		bw.close();
	}
}
