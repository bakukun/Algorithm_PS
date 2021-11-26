import java.io.*;
import java.util.PriorityQueue;

public class Q1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        int n = Integer.parseInt(bf.readLine());
        for(int i = 0; i < n ; i++){
            int a = Integer.parseInt(bf.readLine());
            if ( a == 0 ){
                if(priorityQueue.isEmpty()){
                    bw.write("0");
                }
                else{
                    bw.write(Integer.toString(priorityQueue.poll()));
                }
                bw.newLine();
            }
            else{
                priorityQueue.add(a);
            }

        }
        bw.flush();
        bw.close();
    }
}
