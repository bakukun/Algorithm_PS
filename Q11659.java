import java.io.*;
import java.util.StringTokenizer;

public class Q11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];
        int[] prefix = new int[n+1];
        int m = Integer.parseInt(st.nextToken());

        StringTokenizer num = new StringTokenizer(bf.readLine());

        for(int i=1;i<=n;i++){
            arr[i]= Integer.parseInt(num.nextToken());
            if( i ==1 ){
                prefix[i] = arr[i];
            }
            prefix[i] = prefix[i-1]+arr[i];
        }
        for(int i=0;i<m;i++){
            StringTokenizer add = new StringTokenizer(bf.readLine());
            int start = Integer.parseInt(add.nextToken());
            int end = Integer.parseInt(add.nextToken());
            bw.write(Integer.toString(prefix[end]-(prefix[start-1])));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
