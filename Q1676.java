import java.io.*;
import java.math.BigInteger;

public class Q1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(bf.readLine());
        int cnt = 0;
        BigInteger b = new BigInteger("1");
        for(int i =1; i <=a ;i++){
            b = b.multiply(BigInteger.valueOf(i));
        }
        String str = b.toString();
        int len = str.length();
        for(int i = len-1; i>=0; i--){
            if(str.charAt(i) =='0'){
                cnt++;
            }
            else{
                break;
            }
        }
        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();
    }
}
