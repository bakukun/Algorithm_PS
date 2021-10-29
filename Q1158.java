import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Queue<Integer> q = new LinkedList<>();

        for(int i = 1; i<=n; i++){
            q.offer(i);
        }
        bw.write("<");
        for(int j = 0; j < n; j++){
            for(int a = 1; a < k; a++){
                int tmp = q.peek();
                q.poll();
                q.offer(tmp);
            }
            if(q.size()>1) {
                bw.write(Integer.toString(q.peek()) + ", ");
            }
            else{
                bw.write(Integer.toString(q.peek())+">");
            }
            q.poll();
        }
        bw.flush();
        bw.close();
    }
}

