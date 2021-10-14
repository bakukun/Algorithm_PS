import java.io.*;

public class Q1316 {
    public static boolean Checker(String str){
        boolean[] arr = new boolean[26];
        char prev = ' ';
        char charat;
        for (int j = 0; j<str.length();j++){
            charat = str.charAt(j);
            if (prev != charat){
                if(arr[str.charAt(j)-97] == true){
                    return false;
                }
                else{
                    arr[str.charAt(j)-97] = true;
                    prev = str.charAt(j);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int cnt = 0;

        for (int i = 0; i < n ; i++){
            String str = bf.readLine();
            if(Checker(str) == true){
                cnt++;
            }
        }
        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();
    }
}
