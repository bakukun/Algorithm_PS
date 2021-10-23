import java.util.Scanner;

public class Q1012 {
    public static int[][] graph = new int[50][50];
    public static int n,m;

    public static boolean dfs(int x, int y) {
        if (x <= -1 || x >=n || y <= -1 || y >= m) {
            return false;
        }
        if (graph[x][y] == 1) {
            graph[x][y] = 0;
            dfs(x - 1, y);
            dfs(x, y - 1);
            dfs(x + 1, y);
            dfs(x, y + 1);

            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N, M을 공백을 기준으로 구분하여 입력 받기
        int tries = sc.nextInt();
        for(int i=0; i<tries; i++){
            n = sc.nextInt();
            m = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine(); // 버퍼 지우기
            for(int j=0;j<k;j++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                graph[a][b] = 1;
            }
            int result = 0;
            for (int l = 0; l < n; l++) {
                for (int j = 0; j < m; j++) {
                    // 현재 위치에서 DFS 수행
                    if (dfs(l, j)) {
                        result += 1;
                    }
                }
            }
            System.out.println(result);
        }


    }
}
