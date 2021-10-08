import java.util.Scanner;

public class Q10988 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int len = a.length();
		for(int i=0; i<(len/2); i++){
			if (a.charAt(i) != a.charAt(len-i-1)){
				System.out.println("0");
				System.exit(0);
				}
			}
		System.out.println("1");
	}
}
