import java.util.Scanner;

public class Q2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 5 == 0) {
            System.out.println(n / 5);
        }

        else if( n % 5 == 1) {
            if (n>1) {
                System.out.println(2+((n-6)/5));
            }
            else {
                System.out.println(-1);
            }
        }

        else if(n % 5 == 2) {
            if (n>=12){
                System.out.println(4+((n-12)/5));
            }
            else {
                System.out.println(-1);
            }
        }

        else if (n % 5 == 3) {
            System.out.println((n / 5) + 1);
        }

        else if(n % 5 == 4) {
            if (n>=9){
                System.out.println(3+((n-9)/5));
            }
            else {
                System.out.println(-1);
            }
        }
    }
}
