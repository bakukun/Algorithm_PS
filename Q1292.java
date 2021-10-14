import java.util.Scanner;

public class Q1292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int tmp = 0;
        int cnt = 0;
        int[] arr = new int[1001];
        for(int i =1; i <=45;i++){
            tmp+= i;
            for(int j = (tmp-i+1); j<=tmp; j++){
                if(j>1000){
                    break;
                }
                arr[j] = i;
            }
        }
        for(int k = a; k <= b;k++){
            cnt+=arr[k];
        }
        System.out.println(cnt);
    }
}
