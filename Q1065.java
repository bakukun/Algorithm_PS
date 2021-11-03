import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1065 {
    public static int sequence(int n){
        int cnt = 0;
        int start = 1;
        while(start<=n){
            if(start<=99){
                start++;
                cnt++;
            }
            else if(100<=start||start<=999){
                int tmp = start;
                int a = tmp%10;
                int b = ((tmp/10)%10);
                int c = (tmp/100);
                if((2*b)==(a+c)){
                    cnt++;
                }
                start++;
            }
        }
        return cnt;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        System.out.println(sequence(n));
    }
}
