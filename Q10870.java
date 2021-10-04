import java.util.Scanner;

public class Q10870 {

    public static int fivo(int n){
        if (n==0) {
            return 0;
        }
        else if (n==1){
            return 1;
        }
        return fivo(n-1)+fivo(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = fivo(N);
        System.out.println(sum);
    }
}

