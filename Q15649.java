import java.util.Scanner;

public class Q15649 {

    public static int[] arr;
    public static boolean[] visit;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        arr = new int[M];
        visit = new boolean[N];
        dfs(N, M, 0);
        System.out.println(sb);

    }

    public static void dfs(int N, int M, int depth) {
        if (depth == M) {
            for (int val : arr) {
                //System.out.println("현재 depth: "+depth+" 현재 원소: "+val);
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < N; i++) {
            //System.out.println("현재 depth: "+depth+" 현재 i: "+i+" 현재 visit["+i+"]: "+visit[i]);
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i + 1;
                dfs(N, M, depth + 1);
                visit[i] = false;
            }
        }
    }

}
