import java.util.Scanner;

public class Q2740 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] A = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        int k = sc.nextInt();
        int[][] pdt = new int[n][k];
        int[][] B = new int[x][k];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < k; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        for(int a =0; a<n; a++){
            for(int b=0; b<k; b++){
                for(int c=0; c<m; c++){
                    pdt[a][b] += (A[a][c]) * (B[c][b]);
                }
                if (b==k-1) {
                    System.out.print(pdt[a][b]);
                }
                else {
                    System.out.print(pdt[a][b]+" ");
                }
            }
            System.out.print("\n");
        }
    }
}
