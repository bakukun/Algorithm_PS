import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5554 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int n = 3;
        while (n-- > 0) {
            a += Integer.parseInt(bf.readLine());
        }
        System.out.println(a / 60);
        System.out.print(a % 60);
    }
}
