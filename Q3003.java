import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int a = 1 - Integer.parseInt(st.nextToken());
        int b = 1 - Integer.parseInt(st.nextToken());
        int c = 2- Integer.parseInt(st.nextToken());
        int d = 2- Integer.parseInt(st.nextToken());
        int e = 2- Integer.parseInt(st.nextToken());
        int f = 8- Integer.parseInt(st.nextToken());
        System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f);
    }
}
