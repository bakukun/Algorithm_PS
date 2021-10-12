import java.util.Scanner;
import java.lang.Math;

public class Q1978 {
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
        int n = sc.nextInt();
        int cnt = 0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if (Is_Prime(arr[i])==true) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
