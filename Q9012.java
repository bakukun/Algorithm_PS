import java.io.*;
import java.util.*;

public class Q9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(bf.readLine());
        loop :
        for(int i = 0; i<cnt;i++){
            int front = 0;
            int back = 0;
            String str = bf.readLine();
            if(str.length() %2 == 1){
                bw.write("NO\n");
                continue;
            }
            for(int j=0; j< str.length(); j++){
                if (str.charAt(j)=='('){
                    front++;
                }
                else if(str.charAt(j)==')'){
                    back++;
                }
                if(back>front){
                    bw.write("NO\n");
                    continue loop;
                }
            }
            if(front != 0 && back != 0 && front == back) {
                bw.write("YES\n");
            }
            else{
                bw.write("NO\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
