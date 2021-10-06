import java.util.Scanner;
import java.lang.Math;

public class Q10996 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		if (n == 1) {
			System.out.println("*");
		}
		else if(n%2 ==1){
			for (int i = 0; i < Math.pow(n,2); i++){
				System.out.print("*");
				cnt++;
				if(cnt == n) {
					System.out.print("\n");
					cnt = 0;
				}
					System.out.print(" ");
					cnt++;
				if(cnt == n) {
					System.out.print("\n");
					cnt = 0;
				}
			}
		}
		else{
			for(int a=0; a < n; a++){
				for(int b=0; b<n; b++){
					if(b%2==0){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				}
				System.out.print("\n");
				for(int c=0; c<n; c++){
					if(c%2==0){
						System.out.print(" ");
					}
					else{
						System.out.print("*");
					}
				}
				System.out.print("\n");
			}
		}
	}
}

