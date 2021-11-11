import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int[] A = new int[a];
        int b = Integer.parseInt(st.nextToken());
        int[] B = new int[b];
        int[] arr = new int [a+b];
        StringTokenizer st_a = new StringTokenizer(bf.readLine(), " ");
        for(int i = 0 ; i < a ; i++){
            A[i] = Integer.parseInt(st_a.nextToken());
        }
        StringTokenizer st_b = new StringTokenizer(bf.readLine(), " ");
        for(int i = 0 ; i < b ; i++){
            B[i] = Integer.parseInt(st_b.nextToken());
        }
        System.arraycopy(A, 0, arr, 0, A.length);
        System.arraycopy(B, 0, arr, A.length, B.length);
        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length ; i++){
            bw.write(Integer.toString(arr[i]));
            bw.write(" ");
        }
        bw.flush();
        bw.close();
    }
}
