import java.io.*;
import java.util.*;


public class Q2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(bf.readLine());
        Deque<Integer> q = new LinkedList<>();
        for(int i = cnt; i>0;i--){
            q.addFirst(i);
        }
        while(cnt>1){
            q.poll();
            cnt--;
            if(cnt == 1){
                break;
            }
            q.addLast(q.peek());
            q.poll();
        }
        bw.write(Integer.toString(q.peek()));
        bw.flush();
        bw.close();
    }
}
