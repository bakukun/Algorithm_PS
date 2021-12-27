import java.io.*;
import java.util.StringTokenizer;

public class Q1629 {
    public static int cnt = 0;
    private static long pow(long a, long b, long c) {
        //cnt++;
        //System.out.println(" 함수실행횟수:"+ cnt);
        // 지수가 0인 경우(종료 조건).
        if (b == 0) {
            return 1;
        }

        // 반으로 나눈 거듭제곱 계산.
        //System.out.println("b가 "+b/2+"일때 res값구하는 함수 진입");
        long res = pow(a, b / 2,c);
        //System.out.println("b가 "+b/2+"일때 res값 결과: "+ res);

        // 지수가 짝수인 경우.
        if (b % 2 == 0) {
            return (res * res) % c ;
        }
        // 지수가 홀수인 경우
        else {
            return( res * res % c) * a % c;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());
        System.out.println(pow(a,b,c));
    }
}

