import java.io.*;

public class Q11653 {
    public static void gcd(int n){
        if (n==1){
            return;
        }
        int tmp = 1;
        for(int i = 2; i <= n; i++){
            if(n%i ==0){
                tmp = i;
                System.out.println(i);
                break;
            }
        }
        gcd(n/tmp);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        gcd(n);
    }
}
