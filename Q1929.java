import java.util.Scanner;

public class Q1929 {
    public static boolean Is_Prime(int n){
        if (n==1){
            return false;
        }

        for(int i=2; i<= Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        for(int i=min;i<=max;i++){
            if (Is_Prime(i)==true) {
                System.out.println(i);
            }
        }

    }
}

