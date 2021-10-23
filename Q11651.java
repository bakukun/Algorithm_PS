import java.util.*;

public class Q11651 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int[][] arr = new int[m][2];

		for (int i = 0; i < m; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}

		Arrays.sort(arr, (o1, o2) -> {
			if (o1[1] == o2[1]) {
			//	System.out.println(o1[0]+" "+o1[1]+" "+o2[0]+" "+o2[1]+"비교: "+Integer.compare(o1[1], o2[1]));
				return Integer.compare(o1[0], o2[0]); //그냥 그 자체로 작다는 거임
			} else {
				return Integer.compare(o1[1], o2[1]);
			}
		});

		for (int i = 0; i < m; i++) {
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
	}
}
