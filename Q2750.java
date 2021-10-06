import java.util.Scanner;

public class Q2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp = 0;
        int[] arr = new int[n];
        for (int i=0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int j=0; j<n-1; j++){
            for(int k=0; k<n-1; k++){
                if(arr[k] > arr[k+1]){
                    tmp = arr[k+1];
                    arr[k+1] = arr[k];
                    arr[k] = tmp;
                }
            }
        }
        for (int a=0; a < n ; a++){
            System.out.println(arr[a]);
        }
    }
}
