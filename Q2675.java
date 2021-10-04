import java.util.*;

public class Q2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((c - b) <= 0) {
            System.out.println(-1);
        } else {
            int tmp = (a / (c - b));
            System.out.println(tmp + 1);
        }
    }
}

