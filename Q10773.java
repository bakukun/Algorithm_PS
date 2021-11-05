import java.io.*;
import java.util.Stack;

public class Q10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        long cnt = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i =0; i < n ; i++){
            int input = Integer.parseInt(bf.readLine());
            if (input != 0){
                stack.push(input);
            }
            else if (input == 0){
                stack.pop();
            }
        }
        while(!stack.empty()){
            cnt+= stack.peek();
            stack.pop();
        }
        bw.write(Long.toString(cnt));
        bw.flush();
        bw.close();
    }
}
