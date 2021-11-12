import java.io.*;
import java.util.Map.*;
import java.util.*;

public class Q1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        HashMap<String, String> name = new HashMap<String, String>();

        for(int i = 1; i<=n;i++){
            String str = bf.readLine();
            name.put(str,Integer.toString(i));
            name.put(Integer.toString(i),str);
        }

        Set<Entry<String, String>> entrySet = name.entrySet();

        for(int i=0; i < k; i++){
            String str2 = bf.readLine();
            bw.write(name.get(str2));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}

