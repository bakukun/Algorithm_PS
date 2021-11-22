import java.io.*;
import java.math.BigInteger;

public class Q11729 {
    public static boolean print = false;
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static void move (int no,int x,int y) throws IOException {
        if(no>1){
            move(no-1,x,6-x-y);
        }
        if(print == true) {
            bw.write(x + " " + y);
            bw.newLine();
        }
        if(no>1){
            move(no-1,6-x-y,y);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        if(n<=20){
            print = true;
            bw.write(Integer.toString((int)Math.pow(2,n)-1));
            bw.newLine();
            move(n,1,3);
        }
        else{
            BigInteger big = new BigInteger("2");
            big = big.pow(n);
            big = big.subtract(BigInteger.ONE);
            bw.write(String.valueOf(big));
        }
        bw.flush();
        bw.close();
    }
}
