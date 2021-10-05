import java.util.*;

public class Q2309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int sum = 0;
		int tmp = 0;
		for(int i=0; i<9; i++){
			arr.add(i,sc.nextInt());
			sum += arr.get(i);
		}

		Collections.sort(arr);

		for(int j=0; j<8; j++){
			for(int k=j+1; k<9; k++){
				tmp = arr.get(j) + arr.get(k);
				if((sum - tmp) == 100){
					arr.remove(k);
					arr.remove(j);
					for(int l=0; l<7; l++){
						System.out.println(arr.get(l));
					}
					System.exit(0);
				}
				else{
					tmp = 0;
				}
			}
		}
	}
}

