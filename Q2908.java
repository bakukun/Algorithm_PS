import java.util.*;

public class Q2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = "";
        String d = "";
        for(int i = 2 ; i >= 0 ; i--){
           c += a.substring(i,i+1);
           d += b.substring(i,i+1);
        }
        int A = Integer.parseInt(c);
        int B = Integer.parseInt(d);
        if (A>B){
            System.out.print(A);
        }
        else {
            System.out.print(B);
        }
    }
}
