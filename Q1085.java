import java.util.*;
import java.lang.Math;

public class Q1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int min_x = Math.min(x,w - x);
        int min_y = Math.min(x,h - y);

        System.out.println(Math.min(min_x,min_y));
    }
}
