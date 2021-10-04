import java.util.Scanner;

public class Q2775 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[15][15];

        for(int k=0; k < 15; k++){
            arr[k][1] = 1;
            arr[0][k] = k;
        }

        for(int a = 1; a <15; a++){
            for(int b =2; b<15; b++){
                arr[a][b] = arr[a][b-1]+arr[a-1][b];
            }
        }

        int cnt = sc.nextInt();
        for(int i = 0 ; i<cnt ; i++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int sum = arr[N][K];
            System.out.println(sum);
        }
    }
}
