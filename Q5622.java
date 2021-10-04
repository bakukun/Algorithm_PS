import java.util.Scanner;

public class Q5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int a = str.charAt(i)-65 ;
            if (a<3) {
                sum+=3;
            }
            else if (a<6) {
                sum+=4;
            }
            else if (a<9) {
                sum+=5;
            }
            else if (a<12) {
                sum+=6;
            }
            else if (a<15) {
                sum+=7;
            }
            else if (a<19) {
                sum+=8;
            }
            else if (a<22) {
                sum+=9;
            }
            else if (a<26) {
                sum+=10;
            }
        }
    System.out.println(sum);
    }
}
