import java.io.*;
import java.util.*;

public class Q1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        String[] arr = new String[n];
        int[][] arr2 = new int[2][13];

        for (int i = 0; i < n; i++) {
            arr[i] = bf.readLine();
            arr2[0][i] = arr[i].length();
        }

        Arrays.sort(arr2);

    }
}
