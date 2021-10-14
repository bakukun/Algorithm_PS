import java.util.Scanner;

public class Q7568 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] w = new int[n][2];
        for(int i = 0; i < n; i++){
            w[i][0] = sc.nextInt();
            w[i][1] = sc.nextInt();
        }

        for(int i =0; i < n;i++){
            int rank = 1;
            for(int j = 0; j <n; j++){
                if(i==j) continue;
                if(w[i][0]<w[j][0] &&w[i][1]<w[j][1]){
                    rank++;
                }
            }
            System.out.print(rank+" ");
        }
    }
}
