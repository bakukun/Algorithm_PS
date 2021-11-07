import java.io.*;
import java.util.Stack;

public class Q1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tmp = 0;
        int n = Integer.parseInt(bf.readLine());
        Stack<Integer> stack = new Stack<>();
        while(n > 0) {
            int value = Integer.parseInt(bf.readLine());
            if(tmp<value){
                for(int j = tmp+1 ; j <= value ; j++) {
                    stack.push(j);
                    sb.append('+').append('\n');
                }
                tmp = value;
            }
            else if(stack.peek() != value) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append('-').append('\n');
            n--;
        }
        System.out.println(sb);
    }
}

