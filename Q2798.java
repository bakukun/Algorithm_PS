import java.util.*;

public class Q2798 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        int tmp = 0;
        int[] arr = new int[a];
        for(int i=0; i < a; i++){
            arr[i] = sc.nextInt();
        }
        for(int x = 0; x < a-2; x++){
            for(int y = x+1; y < a-1; y++){
                for(int z = y+1; z < a; z++){
                    tmp = arr[x] + arr[y] + arr[z];
                    if (tmp <= b && sum < tmp){
                      sum = tmp;
                    }
                }
            }
        }
    System.out.println(sum);
    }
}
