import java.util.Scanner;

public class Q1100 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[8];
		int cnt = 0;

		for (int i = 0; i < 8; i++) {
			arr[i] = sc.nextLine();
		}

		for(int j=0; j < 8; j++){
			if(j%2==0){ //홀수 줄
				for(int k=0; k < 8; k++){
					if(k%2 == 0){ //홀수 칸
						if (arr[j].charAt(k) == 'F'){
							cnt++;
						}
					}
				}
			}
			else{ //짝수 줄
				for(int l=0; l < 8; l++){
					if(l%2 == 1){ //짝수 칸
						if (arr[j].charAt(l) == 'F'){
							cnt++;
						}
					}
				}
			}

		}
		System.out.print(cnt);
	}
}

