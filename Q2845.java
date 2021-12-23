import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2845 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int s = a*b;
        StringTokenizer st2 = new StringTokenizer(bf.readLine(), " ");
        for(int i = 0; i < 5; i++){
            System.out.print(Integer.parseInt(st2.nextToken())-s+" ");
        }
    }
}
