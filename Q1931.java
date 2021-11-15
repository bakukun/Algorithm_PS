import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int cnt = 0;
        Long end = 0l;
        Long arr[][] = new Long[n][3];
        for(int i =0; i <n ;i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            Long a = Long.parseLong(st.nextToken());
            Long b = Long.parseLong(st.nextToken());
            arr[i][0] = a;
            arr[i][1] = b;
            arr[i][2] = b-a;
        }

        Arrays.sort(arr, (o1, o2) -> {
            if(o1[1] == o2[1]) {
                return Long.compare(o1[0], o2[0]);
            }
            else {
                return Long.compare(o1[1],o2[1]);
            }
        });

        for(int i =0; i <n ;i++){
            if(end<=arr[i][0]){
                end = arr[i][1];
                cnt++;
            }
        }

        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();
    }
}
