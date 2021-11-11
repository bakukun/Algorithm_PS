import java.io.*;
import java.util.*;

public class Q17219 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        HashMap <String,String> address = new HashMap<String,String>();

        for(int i =0; i < a; i++) {
            StringTokenizer st2 = new StringTokenizer(bf.readLine(), " ");
            address.put(st2.nextToken(), st2.nextToken());
        }

        for (int i = 0; i < b; i++) {
            String str = bf.readLine();
            bw.write(address.get(str));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
