import java.io.*;
import java.util.StringTokenizer;


public class Q4641 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        int tmp = 0;
        while (true) {
            str = bf.readLine();
            if (str.equals("-1")){
                break;
            }
            if(tmp>0){
                bw.write("\n");
            }
            int blank = 0;
            int cnt = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ' ') {
                    blank++;
                }
            }

            int[] arr = new int[blank + 1];
            StringTokenizer st = new StringTokenizer(str, " ");

            for (int k = 0; k < arr.length; k++) {
                arr[k] = Integer.parseInt(st.nextToken());
            }

            for (int k = 0 ; k < (arr.length-1); k++){
                for(int l=0 ; l < (arr.length-1); l++){
                    if(((arr[l])*2) == arr[k]){
                        cnt++;
                    }
                }
            }
            bw.write(Integer.toString(cnt));
            tmp++;
        }
        bw.flush();
        bw.close();
    }
}
