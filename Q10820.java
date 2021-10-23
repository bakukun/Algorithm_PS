import java.io.*;

public class Q10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = "";
        while ((str = bf.readLine()) != null) {
            int len = str.length();
            int[] arr = new int[4];
            for (int i = 0; i < len; i++) {
                if (str.charAt(i) == 32) {
                    arr[3]++;
                }
                else if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                    arr[1]++;
                }
                else if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                    arr[0]++;
                }
                else {
                    arr[2]++;
                }
            }
            System.out.println(arr[0]);
            bw.write(String.valueOf(arr[0]) + " 음"+ 2);
            bw.flush();
            bw.close();
        }

    }
}
