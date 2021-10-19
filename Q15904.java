import java.io.*;
import java.util.StringTokenizer;

public class Q15904 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int U_idx = -1;
        int C_idx1 = -1;
        int P_idx = -1;
        int C_idx2 = -1;
        String str = bf.readLine();
        for (int a = 0; a < str.length(); a++) {
            if (str.charAt(a)=='U'){
                U_idx = a;
                break;
            }
        }
        for (int b = U_idx+1; b < str.length(); b++) {
            if (str.charAt(b)=='C'){
                C_idx1 = b;
                break;
            }
        }
        for (int c = C_idx1+1; c < str.length(); c++) {
            if (str.charAt(c)=='P'){
                P_idx = c;
                break;
            }
        }
        for (int d = P_idx+1; d < str.length(); d++) {
            if (str.charAt(d)=='C'){
                C_idx2 = d;
                break;
            }
        }
        if (U_idx >= 0 && C_idx1 >= 0 && P_idx >= 0 && C_idx2 >= 0) {
            bw.write("I love UCPC");
        }
        else {
            bw.write("I hate UCPC");
        }
        bw.flush();
        bw.close();
    }
}
