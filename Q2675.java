import java.util.Scanner;

public class Q2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        for (int i = 0; i < cnt; i++) {
            int num = sc.nextInt();
            String str = sc.next();
            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < num; k++) {
                System.out.print(str.substring(j, j + 1));
                }
            }
            System.out.print("\n");
        }
    }
}
