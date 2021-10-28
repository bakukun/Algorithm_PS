import java.io.*;
import java.util.*;

public class Q1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        int[] arr = new int[str.length()];

        for (int i =0; i<arr.length; i++){
            arr[i] = str.charAt(i) - '0';
        }

        Integer[] arr3 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arr3,Collections.reverseOrder());
        for (int i =0; i<arr3.length; i++){
            bw.write(Integer.toString(arr3[i]));
            bw.flush();
        }
        bw.close();
    }
}
