import java.util.Scanner;

public class Q2609 {
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = gcd(a,b);
        System.out.print(ans+"\n"+((a*b)/ans));
    }
}
