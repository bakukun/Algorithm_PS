import java.util.*;
import java.lang.Math;

public class Q4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i=0; i < 30000; i++) {
            arr[0] = sc.nextInt();
            arr[1] = sc.nextInt();
            arr[2] = sc.nextInt();
            Arrays.sort(arr);

            if (arr[0]== 0&& arr[1]==0 && arr[2]==0){
                System.exit(0);
            }
            if(Math.pow(arr[2],2)== (Math.pow(arr[0],2))+(Math.pow(arr[1],2))){
                System.out.print("right");
            }
            else{
                System.out.print("wrong");
            }
            System.out.print("\n");
        }
    }
}
