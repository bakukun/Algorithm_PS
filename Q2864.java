import java.io.*;
import java.util.StringTokenizer;

public class Q2864 {
    public static int max = 0;
    public static int min = 0;
    public static StringBuilder sb = new StringBuilder("");

    public static int min (String A){
        int tmp = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '6') {
                sb.append('5');
            } else {
                sb.append(A.charAt(i));
            }
        }
        tmp = Integer.parseInt(String.valueOf(sb));
        sb.setLength(0);
        return tmp;
    }

    public static int max (String A){
        int tmp = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '5') {
                sb.append('6');
            } else {
                sb.append(A.charAt(i));
            }
        }
        tmp = Integer.parseInt(String.valueOf(sb));
        sb.setLength(0);
        return tmp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        min += (min(a)+min(b));
        max += (max(a)+max(b));
        System.out.println(min+" "+max);
    }
}
