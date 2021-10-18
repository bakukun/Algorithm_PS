import java.util.Scanner;

public class Q2720 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		for(int i = 0 ; i < cnt;i++){
			int money =	sc.nextInt();
			int q = 0;
			int d = 0;
			int n = 0;
			int p = 0;
			q = money / 25;
			money %= 25;
			d = money / 10;
			money %= 10;
			n = money / 5;
			money %= 5;
			p = money / 1;
			money %= 1;
			System.out.println(q+" "+d+" "+n+" "+p);
		}
	}
}
