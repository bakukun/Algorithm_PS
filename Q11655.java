import java.util.Scanner;

public class Q11655 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		char[] arr = new char[a.length()];
		for (int i = 0; i < a.length(); i++) {
			arr[i] = a.charAt(i);
			if ((arr[i] >= 97 && arr[i] <= 109) || (arr[i] >= 65 && arr[i] <= 77)) {
				arr[i] += 13;
			}
			else if ((arr[i] >= 110 && arr[i] <= 122) || (arr[i] >= 78 && arr[i] <= 90)) {
				arr[i] -= 13;
			}
		}
		for(int j=0; j<arr.length;j++){
			System.out.print(arr[j]);
		}
	}
}
