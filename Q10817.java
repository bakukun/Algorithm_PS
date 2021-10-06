import java.util.*;

public class Q10817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] str = new int[3];
        for (int i = 0; i < 3; i++) {
            str[i] = sc.nextInt();
        }
        Arrays.sort(str);
        System.out.println(str[1]);
    }
}
