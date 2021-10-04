import java.util.Scanner;

public class Q1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();
        int len = tmp.length();
        if (tmp.isEmpty()){
            System.out.println(0);
        }
        else {
            int a = 1;
            for (int i = 0; i < len; i++) {
                if (tmp.substring(i, i + 1).equals(" ")) {
                    a++;
                }
            }
            if (tmp.substring(0, 1).equals(" ")) {
                a--;
            }
            if (tmp.substring(len - 1, len).equals(" ")) {
                a--;
            }
            System.out.println(a);
        }
    }
}
